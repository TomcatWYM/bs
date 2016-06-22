package com.bs.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 管理员
 * 
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id",nullable=false)
	private Integer  ID; 
	 
	@Column
	private String name;//姓 名

	@Column
	private String password;//密码

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	 
}
