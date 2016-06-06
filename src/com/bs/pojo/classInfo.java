package com.bs.pojo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 班级公告信息
 * 
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "classInfo")
public class classInfo {
	@Id
	@Column(name = "id",nullable=false)
	private String  id; 
	 
	@Column
	private String title;//标题
	@Column
	private String content;//内容
	@Column
	private Date creatDate;//常见时间
	@Column
	private String  authorID;//创建人
	@Column
	private String isShow;//是否显示在主页
	@Column
	private String isDowload;//是否是下载的资料
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	public String getAuthorID() {
		return authorID;
	}
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getIsDowload() {
		return isDowload;
	}
	public void setIsDowload(String isDowload) {
		this.isDowload = isDowload;
	}
	
	
	
}
