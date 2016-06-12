package com.bs.base.pojo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 信息传递
 * 
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "message")
public class Message {
	@Id
	@Column(name = "id",nullable=false)
	private String  id; 
	
	@Column
	private String content;//消息内容
	@Column
	private String hasShow;//是否已经显示
	@Column
	private String sendUserID;//发送用户id
	@Column
	private String aspectUserID;//接受用户id
	@Column
	private Date  sendDate;//发送时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHasShow() {
		return hasShow;
	}
	public void setHasShow(String hasShow) {
		this.hasShow = hasShow;
	}
	public String getSendUserID() {
		return sendUserID;
	}
	public void setSendUserID(String sendUserID) {
		this.sendUserID = sendUserID;
	}
	public String getAspectUserID() {
		return aspectUserID;
	}
	public void setAspectUserID(String aspectUserID) {
		this.aspectUserID = aspectUserID;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	
	 
}
