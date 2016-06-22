package com.bs.service.interFace;


import java.util.List;

import com.bs.pojo.InstructsPaper;
import com.bs.pojo.Paper;
 

public interface InstructsPaperService extends BaseServer<InstructsPaper>{
	public List<InstructsPaper> getByPaperID(Integer id);
}
