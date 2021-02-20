package com.jyk.dao.impl;

import com.jyk.bean.User;
import com.jyk.dao.LoginDaoInteface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * jiyukun     2021年02月20日    Create this file
 * </pre>
 */
public class LoginDaoImpl implements LoginDaoInteface {
    @Override
    public User getUser(String name, String passworld) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "root");
            String sql = "select * from user where name=? and password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,passworld);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}