package com.bs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.pojo.Article;
import com.bs.service.interFace.ArticleService;

@Service
public class ArticleServiceImpl extends BaseServerImpl<Article> implements ArticleService {

	@Override
	public void save(Article entry) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updata(Article entry) {
		// TODO Auto-generated method stub

	}

	@Override
	public Article getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> getByIds(Integer[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> getByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> titleList() {
		List<String> titleList = getSession().createQuery("select a.title from Article a group by a.title").list();
		
		return titleList;
	}

	@Override
	public List<Article> articleList(String title) {
		List<Article> articleList = getSession().createQuery("from Article a where a.title = ?")
				.setParameter(0, title).list();
		return articleList;
	}

	
}
