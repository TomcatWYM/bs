package com.bs.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * 学生
 * @author Administrator
 *
 */
 
@Entity
@Component
public class Student implements Serializable{
	 
	@Column
	private String myPaper;//考过的试卷

	public String getMyPaper() {
		return myPaper;
	}

	public void setMyPaper(String myPaper) {
		this.myPaper = myPaper;
	}
	 
 

 
}
