package com.bs.controller;

import com.bs.base.enums.UserType;
import com.bs.pojo.Paper;
import com.bs.pojo.Student;
import com.bs.pojo.Teacher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.pojo.User;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/paper")
public class CreatePaperController extends BaseController {

	private static final Log logger = LogFactory.getLog(CreatePaperController.class);

	/**
	 *
	 * 添加试卷/到添加试题页面
	 * @return
	 */
	@SuppressWarnings("null")
	@RequestMapping("/addPaper.do")
	public String addPaper(
			@RequestBody Paper paper,
			HttpSession session,
			Model model
			){
		Teacher t=(Teacher)session.getAttribute("teacher");
		paper.setAuthorID(t.getUserID());
		paperService.save(paper);//
		logger.info("paper : add " +paper.getPaperID()+"  success");

		model.addAttribute("paper",paper);
		String type[]=paper.getType().split(";");
		//试卷类型(类型_名称_多少_总分数;)
		String questionType[] = null;
		String questionName[]=null;
		String questionNumber[]=null;
		String questionAllScore[]=null;
		for(int i=0;i<type.length;i++){
			questionType[i]= type[i].split("_")[0];
			questionName[i]= type[i].split("_")[1];
			questionNumber[i]= type[i].split("_")[2];
			questionAllScore[i]= type[i].split("_")[3];
		}
		model.addAttribute("questionType",questionType);
		model.addAttribute("questionName",questionName);
		model.addAttribute("questionNumber",questionNumber);
		model.addAttribute("questionAllScore",questionAllScore);
		return "/paper/createPaper";
	}


}
