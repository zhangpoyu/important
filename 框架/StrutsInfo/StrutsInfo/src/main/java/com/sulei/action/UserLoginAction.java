package com.sulei.action;

public class UserLoginAction {
    public String user_login() {
        System.out.println("跳转到登陆界面");
        return "success";
    }

    public String login_go() {
        System.out.println("登陆成功");
        return "success";
    }

}
