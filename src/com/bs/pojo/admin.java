package com.bs.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
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
public class admin {
	@Id
	@Column(name = "id",nullable=false)
	private String  id; 
	 
	@Column
	private String name;//姓名
	@Column
	private String password;//密码

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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
