package com.bs.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.bs.base.Page;
import com.bs.base.PaperCart;
import com.bs.base.SystemConstant;
import com.bs.pojo.InstructsPaper;
import com.bs.pojo.Paper;
import com.bs.pojo.Problem;
import com.bs.pojo.Teacher;

/**
 * 试卷控制
 *
 */
@Controller   
@RequestMapping("/paper")
public class PaperController extends BaseController  {


	/**
	 * 显示试卷列表页面
	 * 列出所有试卷
	 * @return
	 */
	@RequestMapping("/paper")
	public String paper(Model model){
		List<Paper> paperList = paperService.findAll();
		model.addAttribute("paperList", paperList);

		return "paper/paper";
	}
	/**
	 * 设置试卷基本类型
	 *  
	 * @return
	 */
	@RequestMapping("/createType.do")
	public String CreateType(Model model){


		return "paper/createPaperType";
	}

	/**
	 * 设置试卷信息
	 *  
	 * @return
	 */
	@RequestMapping("/addInstruce.do")
	public void addInstruce(Model model,String paperInfo,String data,HttpSession session){
		Paper paper=new Paper();
        //TODO 每次都实例化 simplateDateFormat 性能？
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(new Date());
		Date createDate=new Date();
		try {
			createDate = formatter.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
            // 禁止用 e.printStackTrace(); 用 logger.error();
			e.printStackTrace();
		}
		paper.setCreateDate(createDate);
		paper.setTitle(paperInfo.split("-")[0]);
		paper.setLabel(paperInfo.split("-")[3]);
		paperService.save(paper);
		session.setAttribute("currentPaperID", paper);
		String sip[]=data.split(";");
		for(String s:sip){
			InstructsPaper ip=new InstructsPaper();
			ip.setAllScore(Integer.parseInt(s.split("_")[3]));
			ip.setInstruct(s.split("_")[1]);
			ip.setNumber(Integer.parseInt(s.split("_")[2]));
			ip.setProType(s.split("_")[0]);
			ip.setPaperScore(Integer.parseInt(paperInfo.split("-")[2]));
			ip.setPaperID(paper.getId());
			instructsPaperService.save(ip);
		}


		return  ;
	}

	/**
	 * 
	 * 根据简历Id 选择试题，确认提交
	 * @return
	 */
	@RequestMapping("/paper/{resumeId}.do")
	public String paper(Model model,@PathVariable int resumeId){

		List<Paper> paperList = paperService.findAll();
		model.addAttribute("paperList", paperList);

		model.addAttribute("resumeId",resumeId);

		return "paper/paper";
	}

	/**
	 * 根据Id 显示试卷
	 * @param id
	 * @return
     * //TODO 最好不要用 pathVariable 不利于 前后端分离时接口参数的设置
	 */
	@RequestMapping("paper/show/{id}.do")
	public String show(@PathVariable int id,Model model,HttpSession session){

		Paper paper = paperService.getById(id);
		if(paper==null){
			return "redirect:/admin/paper.do";
		}

		paper.setSingleList(problemService.getByIds( JSON.parseArray(paper.getSingle(), Integer.class) ) );
		paper.setMultChoiceList(problemService.getByIds(JSON.parseArray(paper.getMultChoice(), Integer.class)));
		paper.setJudegeList(problemService.getByIds(JSON.parseArray(paper.getJudege(), Integer.class)));
		paper.setQuestionList(problemService.getByIds(JSON.parseArray(paper.getQuestion(), Integer.class)));
		paper.setSingleNumber(paper.getSingleList().size());
		paper.setMultChoiceNumber(paper.getMultChoiceList().size());
		paper.setJudgeNumber(paper.getJudegeList().size());
		paper.setQuestionNumber(paper.getQuestionList().size());

		model.addAttribute("paper", paper);
		return "admin/showPaper";
	}



	/**
	 * 组成试卷页面  试题列表
	 * @return
	 */
	@RequestMapping("paper/item/{cur}.do")
	public String addPaper(@PathVariable int cur,Model model,HttpSession session){

		Page page = new Page();
		page.setAmount(SystemConstant.ProblemAmount_PerPage);		//每页页数
		page.setCur(cur);											//当前第几页
		page.setSum( problemService.getMaxPageNum(page));			//一共多少页
		List<Problem> problemList = problemService.findAll(page);	//数据

		
		Paper paper=(Paper) session.getAttribute("currentPaperID");
		List<InstructsPaper> list=instructsPaperService.getByPaperID(paper.getId());
		model.addAttribute("instructsList",list);
		model.addAttribute("paper",paper);
		model.addAttribute("problemList",problemList);
		model.addAttribute("page", page);
		return "paper/problemList";
	}



	/**
	 * 保存试卷
	 * @return
	 */
	@RequestMapping("paper/save.do")
	public String save(String title ,HttpSession session){

		PaperCart cart = (PaperCart) session.getAttribute("paperCart");
		if(cart==null){
			return "redirect:/paper/paper/item/1.do";
		}
		Paper p=(Paper)session.getAttribute("currentPaperID");
		 
		Paper paper = cart.toPaper(cart);		//根据试题篮 生成试卷
		paper.setId(p.getId());
		paper.setLabel(p.getLabel());
		paper.setTitle(title);
		Teacher t=(Teacher)session.getAttribute("teacher");
		paper.setTeacherID(t.getUserID());;
		paperService.updata(paper);

		return "redirect:/paper/paper.do";
	}

	/**
	 * 修改试卷页面
	 * @return
	 */
	@RequestMapping("paper/edit.do")
	public String edit(){

		return "paper/editPaper";
	}


	/**
	 * 修改试卷
	 * @return
	 */
	@RequestMapping("paper/update.do")
	public String update(){

		return "paper/editPaper";
	}

	/**
	 * 根据Id删除试卷
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("paper/delete/{id}.do")
	public void delete(@PathVariable int id ,HttpServletResponse response){

		try {
			paperService.delete(id);
			response.getWriter().println("{\"mes\":\"success\"}");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				response.getWriter().println("{\"mes\":\"error\"}");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

	/**
	 * 提交答案
	 * @return
	 */
	@RequestMapping("/paper/answer.do")
	public String answer( @RequestParam int id,HttpServletRequest request){
		Paper paper = paperService.getById(id);
		if(paper==null){
			return "redirect:/paper/paper.do";
		}
		HashMap<String,String> answer = new HashMap<String,String>();
		for( Integer i : JSON.parseArray(paper.getSingle(), Integer.class) ){
			answer.put(i+"", request.getParameter(i+""));
		}
		for( Integer i : JSON.parseArray(paper.getMultChoice(), Integer.class) ){
			answer.put(i+"", Arrays.toString((request.getParameterValues(i+""))) );
		}
		for( Integer i : JSON.parseArray(paper.getJudege(), Integer.class) ){
			answer.put(i+"", request.getParameter(i+""));
		}
		for( Integer i : JSON.parseArray(paper.getQuestion(), Integer.class) ){
			answer.put(i+"", request.getParameter(i+""));
		}
		String ans  = JSON.toJSONString(answer);
		request.getSession().setAttribute("ans", ans);
		return "redirect:/paper/paper.do";
	}
}
