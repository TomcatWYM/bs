package com.bs.service;

import com.bs.pojo.FriendShip;
import com.bs.pojo.Message;
import com.bs.pojo.Student;
import com.bs.service.interFace.FriendShipService;
import com.bs.service.interFace.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Maple on 2016/6/14.
 */
@Service
public class FriendShipServiceImpl extends BaseServerImpl<FriendShip> implements FriendShipService {

    @Autowired
    private MessageService messageService;

    @Override
    public void save(FriendShip friendShip) {
        if(friendShip.getEnable()==null){
            friendShip.setEnable(0);    //默认好友关系不可用
        }
        messageService.sendUserApplyMessage(friendShip.getUserID(),friendShip.getFriendID());
        FriendShip fs = this.getByUserIdAndFriendId(friendShip.getUserID(),friendShip.getFriendID());
        if(fs==null){   //如果不存在 添加
            super.save(friendShip);
        }
    }

    @Override
    public FriendShip getByUserIdAndFriendId(Integer userId, Integer friendId) {
        FriendShip f = (FriendShip) getSession()
                .createQuery("from FriendShip fs where fs.userID = ? and fs.friendID = ?")
                .setParameter(0, userId)
                .setParameter(1,friendId)
                .uniqueResult();
        return f;
    }

    @Override
    public void accept(Integer messageId) {
        Message message = messageService.getById(messageId);
        FriendShip friendShip  = getByUserIdAndFriendId(message.getSenderID(),message.getReceiverID());
        friendShip.setEnable(1);    //同意
        updata(friendShip);

        //同意后 生成两条记录，对象默认添加自己为好友
        FriendShip fs = getByUserIdAndFriendId(message.getReceiverID(),message.getSenderID());
        if(fs!=null){
            if(fs.getEnable()==0){
                fs.setEnable(1);
                updata(fs);
            }
        }else{
            fs = new FriendShip();
            fs.setUserID(friendShip.getFriendID());
            fs.setFriendID(friendShip.getUserID());
            fs.setEnable(1);
            save(fs);
        }

        //好友同意后 发送系统消息
        messageService.sendApplyAcceptMessage(message.getSenderID(),message.getReceiverID());
        //删除好友申请
        messageService.delete(messageId);



    }

    @Override
    public List<Student> findFriends(Integer userID) {
        List<Student> studentList =  getSession()
                .createSQLQuery("select * from student s where s.userid in (" +
                        "select friendID from friendship  where userid = ?)")
                .addEntity(Student.class)
                .setInteger(0,userID)
                .list();
        if(studentList!=null && !studentList.isEmpty()){
            for(Student s : studentList){
                s.setPassword("***");
            }
        }
        return studentList;
    }
}
