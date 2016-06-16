package com.bs.pojo;



import com.bs.base.enums.MessageType;
import com.bs.base.enums.UserType;

import java.util.Date;

import javax.persistence.*;

/**
 * 信息传递
 * 
 * @author Administrator
 *
 */
 
@Entity
@Table(name = "message")
public class Message {

    public Message(){
        this.sendDate = new Date();
    }

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id",nullable=false)
	private Integer  id;
	
	@Column
	private String content;//消息内容
	@Column
	private Integer hasShow = 0;//是否已经显示
	@Column
	private Integer senderID;//发送用户id

    private String senderName;  //发送者用户名

    private String receiverName;    //接受者用户名

	@Column
	private Integer receiverID;//接受用户id

	@Column(columnDefinition = "DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP")
	private Date  sendDate;//发送时间

    @Column
    private String userType = UserType.STUDENT.getName();

    @Column
    private String messageType = MessageType.COMMON.getName();


    public static class MessageBuilder{
        private Message message;
        public MessageBuilder(){
            this.message = new Message();

        }
        public MessageBuilder setSenderIdAndName(Integer senderId,String senderName){
            this.message.setSenderID(senderId);
            this.message.setSenderName(senderName);
            return this;
        }

        public MessageBuilder setReceiverIdAndName(Integer receiverId,String receiverName){
            this.message.setReceiverID(receiverId);
            this.message.setReceiverName(receiverName);
            return this;
        }

        public MessageBuilder setContent(String content){
            this.message.setContent(content);
            return this;
        }

        public MessageBuilder setMessageTypeAndUserType(MessageType messageType,UserType userType){
            this.message.setMessageType(messageType.getName());
            this.message.setUserType(userType.getName());
            return this;
        }

        public Message build(){
            return this.message;
        }

    }


	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getHasShow() {
		return hasShow;
	}
	public void setHasShow(Integer hasShow) {
		this.hasShow = hasShow;
	}

	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSenderID() {
        return senderID;
    }

    public void setSenderID(Integer senderID) {
        this.senderID = senderID;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public Integer getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(Integer receiverID) {
        this.receiverID = receiverID;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
        if(messageType.equalsIgnoreCase(MessageType.NOTIFY.getName())){
            this.senderID=0;
            this.senderName="系统";
        }
    }
}
