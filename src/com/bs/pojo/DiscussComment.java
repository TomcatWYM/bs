package com.bs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 讨论的回复内容
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "articlecomment")
public class DiscussComment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id",nullable=false)
	private Integer  ID; 
	 
	@Column
	private String content; // 评论内容
	@Column
	private String userId; // 评论者的id
	@Column
	private String articleId; // 文章id
	@Column
	private String useredId; //被评论的用户id
	@Column
	private String number; // 第n条回复
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getUseredId() {
		return useredId;
	}
	public void setUseredId(String useredId) {
		this.useredId = useredId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	 
	 
}
