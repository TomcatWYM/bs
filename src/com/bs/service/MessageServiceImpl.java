package com.bs.service;

import com.bs.base.enums.MessageType;
import com.bs.base.enums.UserType;
import com.bs.pojo.Message;
import com.bs.pojo.Student;
import com.bs.pojo.User;
import com.bs.service.interFace.MessageService;
import com.bs.service.interFace.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Maple on 2016/6/12.
 */
@Service
public class MessageServiceImpl extends BaseServerImpl<Message> implements MessageService {

    @Autowired
    protected StudentService studentService;


    @Override
    public List<Message> findSendList(Integer senderID) {
        List<Message> list = getSession().createQuery("from Message m where m.senderID = ?")
                                .setParameter(0,senderID).list();
        return list;
    }

    @Override
    public List<Message> findReceiveList(Integer receiverID) {
        List<Message> list = getSession().createQuery("from Message m where m.receiverID = ?")
                .setParameter(0,receiverID).list();
        return list;
    }

    @Override
    public void sendUserApplyMessage(Integer userID, Integer friendID) {
        Student sender = studentService.getById(userID);
        if(sender==null){
            return ;
        }
        Student receiver = studentService.getById(friendID);
        if(receiver==null){
            return ;
        }
        Message message = new Message.MessageBuilder()
                .setSenderIdAndName(0,"系统")
                .setReceiverIdAndName(friendID,receiver.getRealName())
                .setContent(sender.getUsername()+"("+sender.getRealName()+")"+"要添加您为好友")
                .setMessageTypeAndUserType(MessageType.FRIEND_APPLY,UserType.STUDENT).build();
        super.save(message);
    }
}
