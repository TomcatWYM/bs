package com.bs.service;

import com.bs.pojo.FriendShip;
import com.bs.pojo.Message;
import com.bs.service.interFace.FriendShipService;
import com.bs.service.interFace.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        super.save(friendShip);
    }
}
