package com.bs.controller;

import com.bs.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
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
        User u = userService.login(user);
        //登陆成功
        if(u!=null){
            session.setAttribute("user", u);	//把用户信息添加到session中，跳转到主页面
            return INDEX;
        }
        //登陆失败
        model.addAttribute("error", "用户名或密码错误");
        return LOGIN_REGISTER;		//返回到登陆页面

    }

    @RequestMapping("/register.do")
    public String register(User user){
        userService.save(user);
        return "index/main";
    }
}
