package com.qf.dao.impl;

import com.qf.dao.UserDelDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelDaoImpl implements UserDelDao {
    @Override
    public int del(Integer id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf8&serverTimezone=UTC", "root", "root");
            preparedStatement = connection.prepareStatement("delete from user where u_id=?");
            preparedStatement.setObject(1,id);
            int i = preparedStatement.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
