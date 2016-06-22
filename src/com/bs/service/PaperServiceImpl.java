package com.bs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.pojo.Paper;
import com.bs.service.interFace.PaperService;
 

@Service
@SuppressWarnings("unchecked")
public class PaperServiceImpl extends BaseServerImpl<Paper> implements PaperService{
	
	
	@Override
	public List<Paper> findAll() {
		
		return (List<Paper>) getSession().createQuery("from Paper p order by p.createDate").list();
	}
}	
