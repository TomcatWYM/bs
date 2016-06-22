package com.bs.pojo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 话题讨论的内容
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "discuss")
public class Discuss {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "discussid",nullable=false)
	private Integer  discussID; 
	 
	@Column
	private String title; //标签
	@Column
	private String author; //作者
	@Column
	private String headTitle; //标题（大致方向）
	@Column
	private String content; //讨论内容
	@Column
	private String appriseNumber; //点赞数量
	
	@Column
	private String showNuber; //查看数量
	@Column
	private String backNuber; //回复数量
	@Column
	private Date createDate; //发表时间
	public Integer getDiscussID() {
		return discussID;
	}
	public void setDiscussID(Integer discussID) {
		this.discussID = discussID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getHeadTitle() {
		return headTitle;
	}
	public void setHeadTitle(String headTitle) {
		this.headTitle = headTitle;
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
	public String getBackNuber() {
		return backNuber;
	}
	public void setBackNuber(String backNuber) {
		this.backNuber = backNuber;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	  
	 
}
