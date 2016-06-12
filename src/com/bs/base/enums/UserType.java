package com.bs.base.enums;

public enum UserType {
    ADMIN("admin"),
    STUDENT("student"),
    TEACHER("teacher");

    private String name;
    UserType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  static UserType toUserType(String userType){
        if(userType.equals("admin")){
            return UserType.ADMIN;
        }
        if(userType.equals("student")){
            return UserType.STUDENT;
        }
        if(userType.equals("teacher")){
            return UserType.TEACHER;
        }

        throw new IllegalArgumentException("未知的用户类型");
    }
}
