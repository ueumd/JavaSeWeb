package com.daysun.webmvc.dao;

import com.daysun.webmvc.domain.User;
import com.sun.javaws.jnl.XMLUtils;
import com.sun.xml.internal.txw2.Document;
import com.sun.xml.internal.ws.model.RuntimeModelerException;

/**
 * IUserDao接口的实现类
 */
public class UserDaoImpl implements IUserDao {

    public User find(String userName, String userPwd) {
        try{

        }catch (Exception e){
            throw new RuntimeModelerException(e);
        }
        return null;
    }

    public User find(String userName) {
        return null;
    }

    public void add(User user) {

    }
}
