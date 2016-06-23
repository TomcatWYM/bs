package com.bs.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

 


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bs.base.PaperCart;
import com.bs.pojo.InstructsPaper;
import com.bs.pojo.Paper;
import com.bs.pojo.Problem;


/**
 * 
 * 试题篮控制器
 * @author  
 *
 */
 @Controller
@RequestMapping("/paperCart")
public class PaperCartController  extends BaseController {
	
	 
	
	/**
	 * 跳转到试卷篮页面
	 * @return
	 */
	@RequestMapping("/paperCart.do")
	public String paperCart(HttpSession session,Model model){
		PaperCart cart = (PaperCart) session.getAttribute("paperCart");
		if(cart==null){		//	如果试卷篮为空，创建 添加到session
			cart = new PaperCart();
			session.setAttribute("paperCart", cart);
		}
		List<Problem> singles = problemService.getByIds(  cart.toArray(cart.getSingles()) );
		List<Problem> multChoices = problemService.getByIds(  cart.toArray(cart.getMultChoices()) );
		List<Problem> judges = problemService.getByIds( cart.toArray(cart.getJudges()) );
		List<Problem> questions = problemService.getByIds( cart.toArray(cart.getQuestions()));
		
		Paper paper=(Paper) session.getAttribute("currentPaperID");
		List<InstructsPaper> list=instructsPaperService.getByPaperID(paper.getId());
		model.addAttribute("instructsList",list);
		model.addAttribute("paper",paper);
		
		model.addAttribute("singles", singles);
		model.addAttribute("multChoices", multChoices);
		model.addAttribute("judges", judges);
		model.addAttribute("questions", questions);
		
		return "paper/paperCart";
	}
	
	/**
	 * 试卷篮操作	基于ajax
	 * @param action
	 * @param id
	 * @param session
	 */
	@RequestMapping("/paperCart/action/{action}.do")
	public void opera(@PathVariable String action , Integer id ,HttpSession session){
		PaperCart cart = (PaperCart) session.getAttribute("paperCart");
		if(cart==null){		//	如果试卷篮为空，创建 添加到session
			cart = new PaperCart();
			session.setAttribute("paperCart", cart);
		}
		Problem problem = problemService.getById(id);
		if(problem == null){	//	如果试题为空，返回
			return ;
		}
		if("add".equals(action)){	//	如果为添加试卷
            //TODO 都加了 Log了 还用 system.out啊 禁止用这个输入控制台 用 logger.info() 或者 Logger.debug()
			System.out.println("in-----------------------------------");
			cart.add(problem);
		} 
		if("remove".equals(action)){
			System.out.println("remove-------------------------------");
			cart.remove(problem);
		}
		session.setAttribute("paperCart", cart);
		return ;
	}

}
