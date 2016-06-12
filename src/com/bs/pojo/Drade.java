package com.bs.pojo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 成绩表
 * 
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "grade")
public class Drade {
	@Id
	@Column(name = "id",nullable=false)
	private String  id; 
	
	@Column
	private String userID;//考试的人的id
	@Column
	private int score;//考试成绩
	@Column
	private String isAll;//是否是最终成绩
	@Column
	private Date createDate;//成绩的创建日期
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getIsAll() {
		return isAll;
	}
	public void setIsAll(String isAll) {
		this.isAll = isAll;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	 
	
	
}
