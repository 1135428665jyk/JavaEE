package com.jyk.service.serviceImpl;

import com.jyk.bean.User;
import com.jyk.dao.LoginDaoInteface;
import com.jyk.dao.impl.LoginDaoImpl;
import com.jyk.service.LoginInterface;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * jiyukun     2021年02月20日    Create this file
 * </pre>
 */
public class LoginServiceImpl implements LoginInterface {
    private LoginDaoInteface instance = new LoginDaoImpl();

    @Override
    public User login(String name, String passworld) throws ClassNotFoundException {
        User user = instance.getUser(name, passworld);
        return user;
    }
}