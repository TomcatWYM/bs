package com.bs.service;

import com.bs.pojo.Student;
import com.bs.pojo.User;
import com.bs.service.interFace.StudentService;
import org.springframework.stereotype.Service;

/**
 * Created by Maple on 2016/6/12.
 */
@Service
public class StudentServiceImpl extends BaseServerImpl<Student> implements StudentService {


    @Override
    public Student login(User user) {
        Student s = (Student) getSession()
                .createQuery("from Student u where u.email = ? or u.username = ?" +
                        "and u.password= ? ")
                .setParameter(0, user.getEmail())
                .setParameter(1, user.getUsername())
                .setParameter(2, user.getPassword()).uniqueResult();
        return s;
    }

    @Override
    public Student getByUserName(String username) {
        Student s = (Student) getSession()
                .createQuery("from Student u where u.username = ?")
                .setParameter(0, username).uniqueResult();
        return s;
    }

    @Override
    public void updatePwd(Student stu) {
        getSession().update(stu);
    }


}
