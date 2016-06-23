package com.bs.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bs.pojo.Article;

@Controller
@RequestMapping("/article")
public class ArticleController extends BaseController {
	private static final Log logger = LogFactory.getLog(ArticleController.class);
	
	
	
	@RequestMapping("/show.do")
	public ModelAndView showArticle(){
		ModelAndView mav = new ModelAndView();
		//List<String> titleList = articleService.titleList();
		List<Article> alist = articleService.articleList("a");
		List<Article> blist = articleService.articleList("b");
		List<Article> clist = articleService.articleList("c");
		
		mav.addObject("alist", alist);
		mav.addObject("blist", blist);
		mav.addObject("clist", clist);
		
		mav.setViewName("index/beautifulArticle");
		return mav;
	}
}
