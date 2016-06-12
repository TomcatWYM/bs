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
 
@Entity()
@Component
public class Student extends User implements Serializable{

    public Student() {

    }

    public Student(User user) {
        this.email  = user.getEmail();
        this.username  = user.getUsername();
        this.name = user.getName();
        this.password = user.getPassword();

    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "userid",nullable=false)
    protected Integer  userID;

    @Column(unique = true)
    protected String username;

    @Column
    protected String name;//姓名
    @Column
    protected String realName;//真实姓名
    @Column
    protected String sayForYourself;//个性宣言
    @Column
    protected String password;//密码
    @Column
    protected String phoneNumber;//电话号码
    @Column
    protected String sex;//性别
    @Column
    protected Date birthDate;//出生日期
    @Column(unique = true)
    protected String email;//邮箱
    @Column
    protected String adress;//家庭住址
    @Column
    protected String emailID;//邮编
    @Column
    protected String qq;
    @Column
    protected String weixin;//微信号码
    @Column
    protected String classessID;//班级id字符串连接
    @Column
    protected String friendID;//好友id

    @Column(columnDefinition="varchar(20) default 'false'")
    protected String showRealName;//是否显示真实姓名

	@Column
	private String myPaper;//考过的试卷



    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getSayForYourself() {
        return sayForYourself;
    }

    public void setSayForYourself(String sayForYourself) {
        this.sayForYourself = sayForYourself;
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

    public String getMyPaper() {
        return myPaper;
    }

    public void setMyPaper(String myPaper) {
        this.myPaper = myPaper;
    }
}
