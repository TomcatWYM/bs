package com.bs.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.lucene.analysis.gl.GalicianAnalyzer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.bs.base.SystemConstant;
import com.bs.pojo.Grade;
import com.bs.pojo.InstructsPaper;
import com.bs.pojo.Paper;
import com.bs.pojo.Student;


/**
 * 客户端的试卷管理
 * @author 
 *
 */
@Controller
@RequestMapping("/beginPaper")
public class BeginPaperController extends BaseController{
//	 
	 
	 
	
	/**
	 * 用户开始答题
	 * 
	 * @param paperId 试卷Id
	 * @param applyId 用户的申请Id
	 * @return
	 */
	@RequestMapping("/paper/startAnswer/{paperId}.do")
	public String startAnswer(Model model , @PathVariable int paperId ,HttpSession session){
		
		Student stu = (Student) session.getAttribute("student");
		boolean flag = true;
		Paper paper = paperService.getById(paperId);
		
		//计算答题时间
		Date start = paper.getBeginDate();
		Date now = new Date();
		int diff = (int) (now.getTime() - start.getTime()); 
	    int day = diff / (24 * 60 * 60 * 1000);  
        int hour = (diff / (60 * 60 * 1000) - day * 24);  
        int min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);  
        int sec = (diff/1000-day*24*60*60-hour*60*60-min*60);  
//        if(day>0 || hour>0 || min >= 30){
//        	apply.setFinishDate(new Date());
//        	apply.setState(ApplyState.待批阅.toString());
//        	 applyService.updata(apply);
//        	return "redirect:/client/personalCenter"; //	如果试卷已经超时返回答题页面
//        }
        min = SystemConstant.Paper_Time - min -1;
        sec = 60 - sec;
		model.addAttribute("timeLeft", min+":"+sec );
		
		//放入试题信息
		paper.setSingleList(problemService.getByIds( JSON.parseArray(paper.getSingle(), Integer.class) ) );
		paper.setMultChoiceList(problemService.getByIds(JSON.parseArray(paper.getMultChoice(), Integer.class)));
		paper.setJudegeList(problemService.getByIds(JSON.parseArray(paper.getJudege(), Integer.class)));
		paper.setQuestionList(problemService.getByIds(JSON.parseArray(paper.getQuestion(), Integer.class)));
		paper.setSingleNumber(paper.getSingleList().size());
		paper.setMultChoiceNumber(paper.getMultChoiceList().size());
		paper.setJudgeNumber(paper.getJudegeList().size());
		
		List<InstructsPaper> list=instructsPaperService.getByPaperID(paper.getId());
		model.addAttribute("instructsList",list);
//		model.addAttribute("applyId",applyId);
		model.addAttribute("paper",paper);
		return "paper/paper";
		
	}
	
	/**
	 * 提交答案
	 * @return
	 */
	@RequestMapping("/paper/answer.do")
	public String answer( @RequestParam int id,HttpServletRequest request ,HttpSession session ){
		 
		
		//处理答案
		Paper paper = paperService.getById(id);
		if(paper==null){
			return "redirect:/admin/paper";
		}
		HashMap<String,String> answer = new HashMap<String,String>();
		HashMap<String,String> score = new HashMap<String,String>();
		for( Integer i : JSON.parseArray(paper.getSingle(), Integer.class) ){
			answer.put(i+"", request.getParameter(i+""));
			score.put(i+"", "0");
		}
		for( Integer i : JSON.parseArray(paper.getMultChoice(), Integer.class) ){
			answer.put(i+"", Arrays.toString((request.getParameterValues(i+""))) );
			score.put(i+"", "0");
		}
		for( Integer i : JSON.parseArray(paper.getJudege(), Integer.class) ){
			answer.put(i+"", request.getParameter(i+""));
			score.put(i+"", "0");
		}
		for( Integer i : JSON.parseArray(paper.getQuestion(), Integer.class) ){
			answer.put(i+"", request.getParameter(i+""));
			score.put(i+"", "0");
		}
		//生成答案JSON字符串
		String ans  = JSON.toJSONString(answer);
		String sco= JSON.toJSONString(score);
		Grade grade=new Grade();
		grade.setAllScore(0);
		grade.setAnswer(ans);
		grade.setScore(sco);
		Student stu=(Student)session.getAttribute("student");
		grade.setStudentID(stu.getUserID());
		grade.setTeacherID(id);
		grade.setCreateDate(new Date());
		gradeService.save(grade);
		return "redirect:/main/showIndex.do";
	}
	
}
