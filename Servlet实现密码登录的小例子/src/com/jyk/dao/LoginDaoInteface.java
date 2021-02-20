package com.jyk.dao;

import com.jyk.bean.User;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * jiyukun     2021年02月20日    Create this file
 * </pre>
 */
public interface LoginDaoInteface {
    public User getUser(String name,String passworld) throws ClassNotFoundException;
}