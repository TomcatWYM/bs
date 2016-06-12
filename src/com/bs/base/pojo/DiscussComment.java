package com.bs.base.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name = "id",nullable=false)
	private String  id; 
	 
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
