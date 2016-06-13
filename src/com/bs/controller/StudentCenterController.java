package com.bs.controller;

import com.bs.base.enums.UserType;
import com.bs.pojo.Student;
import com.bs.pojo.Teacher;
import com.bs.pojo.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/studentCenter")
public class StudentCenterController extends BaseController {

    private static final Log logger = LogFactory.getLog(StudentCenterController.class);

	@RequestMapping(value="/index.do")
	public String index(){


		return STUDENT_CENTER;
	}

    @RequestMapping(value="/peopleInfo.do")
    public String peopleInfo(
            HttpSession session,
            Model model
    ){
        Student student = (Student) session.getAttribute("student");
        if(student==null){
            return sendError(model,"学生没有登陆");
        }
        student = studentService.getById(student.getUserID());
        model.addAttribute("stu",student);
        return PEOPLE_INFO;
    }

    @RequestMapping(value="/message.do")
    public String message(
            HttpSession session,
            Model model
    ){
        return "student/peopleMessage";
    }

}
