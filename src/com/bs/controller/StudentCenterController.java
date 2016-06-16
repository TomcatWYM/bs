package com.bs.controller;

import com.bs.pojo.Message;
import com.bs.pojo.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


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
        return STUDENT_PEOPLE_INFO;
    }

    @RequestMapping(value="/message.do")
    public String message(
            HttpSession session,
            Model model
    ){
        Student stu = (Student) session.getAttribute("student");

        List<Message> messageSendList = messageService.findSendList(stu.getUserID());
        List<Message> messageReceiveList = messageService.findReceiveList(stu.getUserID());
        model.addAttribute("sendList",messageSendList);
        model.addAttribute("receiveList",messageReceiveList);
        return "student/peopleMessage";
    }
    @RequestMapping("/friends.do")
    public String friendList(
            HttpSession session
    ){
        Student stu = getStudent(session);
        List<Student> friendList = friendShipService.findFriends(stu.getUserID());
        session.setAttribute("friendList",friendList);
        return STUDENT_FRIEND_LIST;
    }

}
