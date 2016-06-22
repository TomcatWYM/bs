package com.bs.controller;

import com.bs.base.enums.UserType;
import com.bs.pojo.Student;
import com.bs.pojo.Teacher;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bs.pojo.User;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    private static final Log logger = LogFactory.getLog(UserController.class);

	@RequestMapping(value="test.do")
	public String loginAdmin(){


		return LOGIN_REGISTER;
	}

    /**
     *
     * 验证登陆
     * @return
     */
    @RequestMapping("/login.do")
    public String login(
            User user,
            HttpSession session,
            Model model
    ){
        Student stu = null;
        Teacher tea = null;
        boolean loginSuccess =false;
        if(user.getUserType().equalsIgnoreCase(UserType.STUDENT.getName())){
            stu = studentService.login(user);
            if(stu!=null){
                loginSuccess = true;
                session.setAttribute("student",stu);
                logger.info("student : " +stu.getUsername()+" login success");
            }
        }
        if(user.getUserType().equalsIgnoreCase(UserType.TEACHER.getName())){
            tea = teacherService.login(user);
            if(tea!=null){
                loginSuccess = true;
                session.setAttribute("teacher",tea);
                logger.info("teacher : " +tea.getUsername()+" login success");
            }
        }
        if(loginSuccess){
            return INDEX;
        }else{
            //登陆失败
            model.addAttribute("error", "用户名或密码错误");
            return LOGIN_REGISTER;		//返回到登陆页面
        }


    }

    @RequestMapping("/register.do")
    public String register(User user){
        Student stu = null;
        Teacher tea = null;
        boolean loginSuccess = false;
        if(user.getUserType().equalsIgnoreCase(UserType.STUDENT.getName())){
           studentService.save(new Student(user));
        }
        if(user.getUserType().equalsIgnoreCase(UserType.TEACHER.getName())){
            teacherService.save(new Teacher(user));
        }
        return "common/jsp/login";
    }
}
