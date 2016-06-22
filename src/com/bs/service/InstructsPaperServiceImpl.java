package com.bs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.pojo.InstructsPaper;
import com.bs.pojo.Message;
import com.bs.pojo.Paper;
import com.bs.service.interFace.InstructsPaperService;
import com.bs.service.interFace.PaperService;


@Service
@SuppressWarnings("unchecked")
public class InstructsPaperServiceImpl extends BaseServerImpl<InstructsPaper> implements InstructsPaperService{

	@Override
	public List<InstructsPaper> getByPaperID(Integer id) {

		List<InstructsPaper> list = getSession().createQuery("from InstructsPaper m where m.paperID = ?")
				.setParameter(0,id).list();
		return list;
	}



}	
