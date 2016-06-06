package com.bs.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 用户，，老师，学生
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "user")
public class user {
	@Id
	@Column(name = "userid",nullable=false)
	private String  userID;//用戶id(老师t 学生s)
	 
	@Column
	private String name;//姓名
	@Column
	private String realName;//真实姓名
	@Column
	private String sayForYourself;//个性宣言
	@Column
	private String password;//密码
	@Column
	private String phoneNumber;//电话号码
	@Column
	private String sex;//性别
	@Column
	private Date birthDate;//出生日期
	@Column
	private String email;//邮箱
	@Column
	private String adress;//家庭住址
	@Column
	private String emailID;//邮编
	@Column
	private String qq;
	@Column
	private String weixin;//微信号码
	@Column
	private String classessID;//班级id字符串连接
	@Column
	private String friendID;//好友id 
	@Column(columnDefinition="varchar default false")
	private String showRealName;//是否显示真实姓名
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getClassessID() {
		return classessID;
	}
	public void setClassessID(String classessID) {
		this.classessID = classessID;
	}
	public String getFriendID() {
		return friendID;
	}
	public void setFriendID(String friendID) {
		this.friendID = friendID;
	}
	public String getShowRealName() {
		return showRealName;
	}
	public void setShowRealName(String showRealName) {
		this.showRealName = showRealName;
	}
	 
}
