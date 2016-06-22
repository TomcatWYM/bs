package com.bs.service.interFace;

import com.bs.pojo.FriendShip;
import com.bs.pojo.Message;
import com.bs.pojo.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface FriendShipService extends BaseServer<FriendShip>{

    FriendShip getByUserIdAndFriendId(Integer userId,Integer friendId);

    void accept(Integer messageId);

    List<Student> findFriends(Integer userID);
}
