package com.bs.service.interFace;

import com.bs.pojo.Student;
import com.bs.pojo.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface StudentService extends BaseServer<Student>{
    Student login(User user);

    Student getByUserName(String username);

    void updatePwd(Student stu);
}
