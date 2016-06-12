package com.bs.pojo;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 试卷试题库
 * 
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "paperquestion")
public class PaperQuestion {
	@Id
	@Column(name = "id",nullable=false)
	private String  id; 
	@Column
	private String  paperID;//试卷
	@Column
	private String content;//内容
	@Column
	private Integer downLoadNumber;//下载次数
	@Column
	private Date createDate;//创建时间
	@Column
	private String difficulty;//难度系数
	@Column
	private String showNumber;//查看次数
	@Column
	private String answer;//答案
	@Column
	private String anuthorId;//谁出的题
	@Column 
	private String title;//标签
	@Column
	private String type;//试题类型；
	
	
	public String getPaperID() {
		return paperID;
	}
	public void setPaperID(String paperID) {
		this.paperID = paperID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public Integer getDownLoadNumber() {
		return downLoadNumber;
	}
	public void setDownLoadNumber(Integer downLoadNumber) {
		this.downLoadNumber = downLoadNumber;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getShowNumber() {
		return showNumber;
	}
	public void setShowNumber(String showNumber) {
		this.showNumber = showNumber;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnuthorId() {
		return anuthorId;
	}
	public void setAnuthorId(String anuthorId) {
		this.anuthorId = anuthorId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	 
}
