package com.daysun.webmvc.dao;

import com.daysun.webmvc.domain.User;

/**
 * Created by Administrator on 2016/10/5.
 */
public interface IUserDao {

    /**
     * 根据用户名和密码来查找用户
     * @param userName
     * @param userPwd
     * @return 查到的用户
     */
    User find(String userName,String userPwd);

    /**
     * 根据用户名来查找用户
     * @param userName
     * @return 查到到的用户
     */
    User find(String userName);

    /**
     * 添加用户
     * @param user
     */
    void add(User user);
}
