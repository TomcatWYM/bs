package com.bs.service.interFace;

import com.bs.pojo.Teacher;
import com.bs.pojo.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface TeacherService extends BaseServer<Teacher>{
    Teacher login(User user);
}
