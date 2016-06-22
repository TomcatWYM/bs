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
public class instructsPaper implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id",nullable=false)
	private Integer ID;
	@Column
	private Integer number;
	@Column
	private Integer allScore;
	@Column
	private Integer paperScore;
	
	
}
