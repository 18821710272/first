package com.qf.dao.impl;

import com.qf.dao.UserAddDao;
import com.qf.pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserAddDaoImpl implements UserAddDao {

    @Override
    public int add(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf8&serverTimezone=UTC", "root", "root");
            preparedStatement = connection.prepareStatement("insert into user values(null,?,?,?,?)");
            preparedStatement.setObject(1, user.getU_name());
            preparedStatement.setObject(2, user.getU_pass());
            preparedStatement.setObject(3, user.getU_sex());
            preparedStatement.setObject(4, user.getU_vip());
            int i = preparedStatement.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
