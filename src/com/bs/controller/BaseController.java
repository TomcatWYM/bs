package com.bs.controller;

import com.bs.service.UserServiceImpl;
import com.bs.service.interFace.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BaseController {

    public static final String INDEX = "index/main";
    public static final String LOGIN_REGISTER= "common/jsp/login_register";

    @RequestMapping(value="index.do")
    public String index(){
        return INDEX;
    }

	@Autowired
    protected UserService userService;
}
