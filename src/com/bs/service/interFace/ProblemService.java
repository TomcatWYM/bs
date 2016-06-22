package com.bs.service.interFace;

import java.util.List;

import com.bs.base.Page;
import com.bs.pojo.Problem;


public interface ProblemService extends BaseServer<Problem>{
	
	/**
	 * 得到最大的页数
	 * @param page	分页信息
	 * @return
	 */
	public int getMaxPageNum(Page page);
	
	/**
	 * 分页显示
	 * @param page 分页信息
	 * @return
	 */
	public List<Problem> findAll(Page page);

	public List<Problem> search(String key); 
}
