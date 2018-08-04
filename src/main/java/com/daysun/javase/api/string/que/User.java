package com.daysun.javase.api.string.que;

public class User {
    // 用户名
    private String username;
    // 密码
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 登录功能
    /*
     * 返回值类型：boolean 参数列表：String username,String password
     */
    public boolean isLogin(String username, String password) {
        // if (this.username.equals(username) && this.password.equals(password))
        // {
        // return true;
        // } else {
        // return false;
        // }
        // 三元改进版
        // return this.username.equals(username) &&
        // this.password.equals(password)?true;false;
        // 最终版
        return this.username.equals(username) && this.password.equals(password);
    }
}
