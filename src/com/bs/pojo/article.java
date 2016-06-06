package com.bs.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 美文
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "article")
public class article {
	@Id
	@Column(name = "articleid",nullable=false)
	private String  articleid; 
	 
	@Column
	private String title; //标题
	@Column
	private String samllTitle; //副标题
	@Column
	private String photoURL; //图片路径
	@Column
	private String author; //作者
	@Column
	private String content; //文章内容
	@Column
	private String appriseNumber; //点赞数量
	
	@Column
	private String showNuber; //查看数量

	public String getArticleid() {
		return articleid;
	}

	public void setArticleid(String articleid) {
		this.articleid = articleid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSamllTitle() {
		return samllTitle;
	}

	public void setSamllTitle(String samllTitle) {
		this.samllTitle = samllTitle;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAppriseNumber() {
		return appriseNumber;
	}

	public void setAppriseNumber(String appriseNumber) {
		this.appriseNumber = appriseNumber;
	}

	public String getShowNuber() {
		return showNuber;
	}

	public void setShowNuber(String showNuber) {
		this.showNuber = showNuber;
	}
	 
}
