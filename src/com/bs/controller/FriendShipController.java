package com.bs.controller;

import com.bs.base.BaseResult;
import com.bs.base.enums.MessageType;
import com.bs.pojo.FriendShip;
import com.bs.pojo.Message;
import com.bs.pojo.Student;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/friendShip")
public class FriendShipController extends BaseController {

    private static final Log logger = LogFactory.getLog(FriendShipController.class);

	@RequestMapping(value="/add.do")
    @ResponseBody
	public BaseResult index(
            @RequestParam(required =  false) Integer userId,
            @RequestParam(required = false) Integer friendId,
            @RequestParam(required= false) String username,
            HttpSession session
    ){
        Student stu = null;
        if(friendId==null && StringUtils.isNotBlank(username)){ //接收人
            stu = studentService.getByUserName(username);
            if(stu==null){
                return BaseResult.createFailure("没有找到用户名为:"+username+"的用户");
            }
            friendId = stu.getUserID();
        }
        if(userId==null){   //发送者
            stu = (Student) session.getAttribute("student");
            userId = stu.getUserID();
        }
        FriendShip friendShip = friendShipService.getByUserIdAndFriendId(userId,friendId);
        if(friendId==null){
            friendShipService.save(friendShip);
        }else{
            return BaseResult.createFailure("对方已经是您的好友了");
        }

		return BaseResult.createSuccess("好友申请已发送");
	}


    @RequestMapping(value = "/acceptApply.do")
    @ResponseBody
    public BaseResult acceptApply(
            @RequestParam() Integer messageId,
            HttpSession session
    ){
        Message message = messageService.getById(messageId);
        if(message==null){
            return BaseResult.createFailure("没有找到指定消息");
        }
        if(!message.getMessageType().equals(MessageType.FRIEND_APPLY.getName())){
            return BaseResult.createFailure("消息类型不是好友申请，不能同意");
        }
        Student stu = getStudent(session);
        if(!message.getReceiverID().equals(stu.getUserID())){
            return BaseResult.createFailure("您不能同意别人的申请");
        }
        friendShipService.accept(messageId);
        return BaseResult.createSuccess("您已经同意了好友的申请，现在你们已经是好友了");
    }




}
