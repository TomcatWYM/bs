package com.bs.pojo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.lucene.facet.taxonomy.IntTaxonomyFacets;
/**
 * 成绩表
 * 
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "grade")
public class Grade {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id",nullable=false)
	private Integer  ID; 
	
	
	@Column
	private String studentID;//考试的人的id
	@Column
	private Integer score;//考试成绩
	@Column
	private Integer proID;//试题ID
	@Column
	private Date createDate;//成绩的创建日期
	@Column
	private Integer teacherID;//最后修改人
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getProID() {
		return proID;
	}
	public void setProID(Integer proID) {
		this.proID = proID;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(Integer teacherID) {
		this.teacherID = teacherID;
	}
	 
}
