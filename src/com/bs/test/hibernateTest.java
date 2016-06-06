package com.bs.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class hibernateTest {
	private ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void HibernateTest() throws Exception{
		SessionFactory s=(SessionFactory)ac.getBean("sessionFactory");
		System.out.println(s.openSession());
	}
	
	
}
