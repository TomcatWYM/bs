package com.bs.controller;

import com.bs.service.UserServiceImpl;
import com.bs.service.interFace.StudentService;
import com.bs.service.interFace.TeacherService;
import com.bs.service.interFace.UserService;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BaseController {

    public static final String INDEX = "index/main";
    public static final String ERROR = "common/jsp/error";
    public static final String LOGIN_REGISTER= "common/jsp/login_register";
    public static final String STUDENT_CENTER = "student/studentCenter";
    public static final String PEOPLE_INFO = "student/peopleInfo";


    @RequestMapping(value="index.do")
    public String index(){
        return INDEX;
    }

    @RequestMapping(value="error.do")
    public String error(){
        return ERROR;
    }

	@Autowired
    protected UserService userService;

    @Autowired
    protected StudentService studentService;

    @Autowired
    protected TeacherService teacherService;

    /**
     * 发送错误
     */
    protected String sendError(Model model , String msg){
        model.addAttribute("msg",msg);
        return ERROR;
    }

    protected String sendError(Model model ,String msg,Log log){
        log.error(msg);
        return this.sendError(model,msg);
    }

    protected String sendError(Model model ,String msg,Log log ,Exception e){
        log.error(msg,e);
        return this.sendError(model,msg);
    }
}
