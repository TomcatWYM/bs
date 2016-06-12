package com.bs.service;

import com.bs.pojo.User;
import com.bs.service.interFace.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Maple on 2016/6/12.
 */
@Service
public class UserServiceImpl extends BaseServerImpl<User> implements UserService {

    public User login(User user) {
        User u = (User) getSessionFactory()
                .openSession()
                .createQuery("from User u where u.email = ? or u.username = ?" +
                        "and u.password= ? ")
                .setParameter(0, user.getEmail())
                .setParameter(1, user.getUsername())
                .setParameter(2, user.getPassword()).uniqueResult();
        return u;
    }
}
