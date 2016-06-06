package com.bs.pojo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 试卷
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "paper")
public class paper {
	@Id
	@Column(name = "paperid",nullable=false)
	private String  paperID; 
	
	@Column
	private String title; //标签
	@Column
	private String name;//试卷名字
	@Column
	private String paperQuestionID;//试卷试题id
	@Column
	private String type;//试卷类型
	@Column
	private Date creatrDate;//创建时间
	@Column
	private Date useDate;//使用时间
	@Column
	private int showTime;//显示时间长度
	@Column
	private String authorID;//谁组的试卷
	
	
	
	public String getPaperID() {
		return paperID;
	}
	public void setPaperID(String paperID) {
		this.paperID = paperID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPaperQuestionID() {
		return paperQuestionID;
	}
	public void setPaperQuestionID(String paperQuestionID) {
		this.paperQuestionID = paperQuestionID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreatrDate() {
		return creatrDate;
	}
	public void setCreatrDate(Date creatrDate) {
		this.creatrDate = creatrDate;
	}
	public Date getUseDate() {
		return useDate;
	}
	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}
	public int getShowTime() {
		return showTime;
	}
	public void setShowTime(int showTime) {
		this.showTime = showTime;
	}
	public String getAuthorID() {
		return authorID;
	}
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}
	
	
	
	
	 
}
