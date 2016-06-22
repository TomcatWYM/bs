package com.bs.controller;

import com.bs.base.BaseResult;
import com.bs.pojo.Message;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/message")
public class MessageController extends BaseController {

    private static final Log logger = LogFactory.getLog(MessageController.class);

    @RequestMapping(value = "/delete.do")
    @ResponseBody
    public BaseResult index(
            @RequestParam() Integer id
    ) {
        messageService.delete(id);
        return BaseResult.createSuccess("删除成功");
    }

    @RequestMapping(value = "/send.do")
    @ResponseBody
    public BaseResult sendMessage(
            @RequestParam() Integer receiverId ,
            @RequestParam() String content,
            @RequestParam(required = false) Integer senderId,
            HttpSession session
    ){
        String senderName = null;
        if(senderId==null || senderId<0){
            senderId = getStudent(session).getUserID();
            senderName = getStudent(session).getRealName();
        }
        Message message = new Message();
        message.setSenderID(senderId);
        message.setSenderName(senderName);
        message.setReceiverID(receiverId);
        message.setContent(content);
        messageService.save(message);
        return BaseResult.createSuccess("发送成功");
    }



}
