package com.jyk.service;

import com.jyk.bean.User;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * jiyukun     2021年02月20日    Create this file
 * </pre>
 */
public interface LoginInterface {
    public User login(String name, String passworld) throws ClassNotFoundException;
}