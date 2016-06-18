package com.bs.service.interFace;

import com.bs.pojo.Paper;
import com.bs.pojo.User;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface PaperService extends BaseServer<Paper>{
}
