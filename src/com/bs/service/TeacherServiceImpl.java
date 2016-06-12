package com.bs.service;

import com.bs.pojo.Teacher;
import com.bs.pojo.User;
import com.bs.service.interFace.TeacherService;
import org.springframework.stereotype.Service;

/**
 * Created by Maple on 2016/6/12.
 */
@Service
public class TeacherServiceImpl extends BaseServerImpl<Teacher> implements TeacherService {


    @Override
    public Teacher login(User user) {
        Teacher t = (Teacher) getSessionFactory()
                .openSession()
                .createQuery("from Teacher u where u.email = ? or u.username = ?" +
                        "and u.password= ? ")
                .setParameter(0, user.getEmail())
                .setParameter(1, user.getUsername())
                .setParameter(2, user.getPassword()).uniqueResult();
        return t;
    }


}
