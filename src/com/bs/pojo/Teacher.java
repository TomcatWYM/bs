package com.bs.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * 老师 
 * @author Administrator
 *
 */
 
@Entity
@Component
public class Teacher extends User implements Serializable {
	 
	@Column
	private String myClassess;//创建的班级
	 
	@Column
	private String myPaper;//个人创建的试卷

	public String getMyClassess() {
		return myClassess;
	}

	public void setMyClassess(String myClassess) {
		this.myClassess = myClassess;
	}

	public String getMyPaper() {
		return myPaper;
	}

	public void setMyPaper(String myPaper) {
		this.myPaper = myPaper;
	}
	 

 
}
