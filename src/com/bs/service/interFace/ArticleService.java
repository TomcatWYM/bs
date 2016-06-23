package com.bs.service.interFace;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bs.pojo.Article;

@Repository
@Transactional
public interface ArticleService extends BaseServer<Article>{
	List<String> titleList();
	List<Article> articleList(String title);
}
