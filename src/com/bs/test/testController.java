package com.bs.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/test")
public class testController {
	
	@RequestMapping(value="test.do")
	public ModelAndView loginAdmin(){
		ModelAndView mode=new ModelAndView();
		mode.setViewName("common/jsp/login_register");
		return mode;
	}
	public static void main(String[] args) {
		String s="1;2;";
		System.out.println(s.split(";").length);
	}
}
