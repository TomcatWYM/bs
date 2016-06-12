package com.bs.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name = "id",nullable=false)
	private String  id; 
	 
	@Column
	private String name;//班级的名字
	@Column
	private String studentID;//学生id
	@Column
	private String TeacherID;//教师id
	@Column
	private int studentNumber;//学生数量
	@Column
	private int teacherNumber;//教师数量
	@Column
	private String headerTeacherID;//班主任id
	@Column
	private String paperID;//试卷id
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(int teacherNumber) {
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
