package com.bs.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 班级
 * 
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "classess")
public class Classess {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id",nullable=false)
	private String  ID; 
	 
	@Column
	private String name;//班级的名字
	@Column
	private String studentID;//学生id
	@Column
	private String TeacherID;//教师id
	@Column
	private Integer studentNumber;//学生数量
	@Column
	private Integer teacherNumber;//教师数量
	@Column
	private String headerTeacherID;//班主任id
	@Column
	private String paperID;//试卷id
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(String teacherID) {
		TeacherID = teacherID;
	}
	public Integer getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
	public Integer getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(Integer teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public String getHeaderTeacherID() {
		return headerTeacherID;
	}
	public void setHeaderTeacherID(String headerTeacherID) {
		this.headerTeacherID = headerTeacherID;
	}
	public String getPaperID() {
		return paperID;
	}
	public void setPaperID(String paperID) {
		this.paperID = paperID;
	}
	
	 
}
