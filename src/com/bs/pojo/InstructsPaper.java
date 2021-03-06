package com.bs.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Generated;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * 试卷 说明
 * 
 * @author 
 *
 */
@Component
@Entity
public class InstructsPaper implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id",nullable=false)
	private Integer ID;
	@Column
	private Integer number;//一道大题总数量
	@Column
	private String instruct;//试题介绍
	@Column
	private Integer allScore;//一道题总成绩
	@Column
	private Integer paperScore;//试卷总成绩
	@Column
	private String proType;//试题类型
	@Column
	private Integer paperID;//大题类型
	
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	public Integer getPaperID() {
		return paperID;
	}
	public void setPaperID(Integer paperID) {
		this.paperID = paperID;
	}
	public String getInstruct() {
		return instruct;
	}
	public void setInstruct(String instruct) {
		this.instruct = instruct;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getAllScore() {
		return allScore;
	}
	public void setAllScore(Integer allScore) {
		this.allScore = allScore;
	}
	public Integer getPaperScore() {
		return paperScore;
	}
	public void setPaperScore(Integer paperScore) {
		this.paperScore = paperScore;
	}
	
}
