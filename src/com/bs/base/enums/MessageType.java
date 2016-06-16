package com.bs.base.enums;

public enum MessageType {
    COMMON("common"),
    NOTIFY("notify"),
    FRIEND_APPLY("friendApply");

    private String name;
    MessageType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  static MessageType toMessageType(String messageType){
        if(messageType.equalsIgnoreCase("common")){
            return MessageType.COMMON;
        }
        if(messageType.equalsIgnoreCase("friendApply")){
            return MessageType.FRIEND_APPLY;
        }
        if(messageType.equalsIgnoreCase("notify")){
            return MessageType.NOTIFY;
        }
        throw new IllegalArgumentException("未知的消息类型");
    }
}
