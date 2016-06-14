package com.bs.pojo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生
 * @author Administrator
 *
 */
 
@Entity()
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"userid","friendid"})})
@Component
public class FriendShip  implements Serializable{

    public FriendShip() {

    }

    public FriendShip(Integer userID, Integer friendID) {
        this.userID = userID;
        this.friendID = friendID;
        enable = 0;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name = "userid", nullable = false)
    private Integer  userID;  //用户Id

    @Column(name = "friendid",nullable=false)
    private Integer friendID;   //好友Id

    private Integer enable;     //还有关系是否启用

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getFriendID() {
        return friendID;
    }

    public void setFriendID(Integer friendID) {
        this.friendID = friendID;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}
