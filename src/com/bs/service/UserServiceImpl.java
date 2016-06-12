package com.bs.service;

import com.bs.pojo.user;
import com.bs.service.interFace.BaseServer;
import org.springframework.stereotype.Service;

/**
 * Created by Maple on 2016/6/12.
 */
@Service
public class UserServiceImpl extends BaseServerImpl<user> implements BaseServer<user> {

    public user login(user user) {
        user u = (user) getSessionFactory()
                .openSession()
                .createQuery("from user u where u.email = ? or u.username = ?" +
                        "and u.password= ? ")
                .setParameter(0, user.getEmail())
                .setParameter(1, user.getUsername())
                .setParameter(2, user.getPassword()).uniqueResult();
        return u;
    }
}
