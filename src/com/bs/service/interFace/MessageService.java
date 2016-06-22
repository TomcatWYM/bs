package com.bs.service.interFace;

import com.bs.pojo.Message;
import com.bs.pojo.Student;
import com.bs.pojo.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface MessageService extends BaseServer<Message>{

    List<Message> findSendList(Integer senderID);

    List<Message> findReceiveList(Integer receiverID);



    void sendUserApplyMessage(Integer userID, Integer friendID);

    void sendApplyAcceptMessage(Integer senderID, Integer receiverID);
}
