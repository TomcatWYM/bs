package com.bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 
/**
 * 试卷控制
 *
 */
@Controller   
@RequestMapping("/main")
public class IndexController extends BaseController  {


	/**
	 * 到达主页
	 * 
	 * @return
	 */
	@RequestMapping("/showIndex.do")
	public String paper(Model model){

		return "index/main";
	}
	 
}
