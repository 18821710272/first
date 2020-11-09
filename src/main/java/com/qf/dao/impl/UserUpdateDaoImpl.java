package com.qf.dao.impl;

import com.qf.dao.UserUpdateDao;
import com.qf.pojo.User;

import java.sql.*;

public class UserUpdateDaoImpl implements UserUpdateDao {
    @Override
    public int update(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf8&serverTimezone=UTC", "root", "root");
            preparedStatement = connection.prepareStatement("update user set u_name=?,u_pass=?,u_sex=?,u_vip=? where u_id=?;");
            preparedStatement.setObject(1,user.getU_name());
            preparedStatement.setObject(2,user.getU_pass());
            preparedStatement.setObject(3,user.getU_sex());
            preparedStatement.setObject(4,user.getU_vip());
            preparedStatement.setObject(5,user.getU_id());
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
