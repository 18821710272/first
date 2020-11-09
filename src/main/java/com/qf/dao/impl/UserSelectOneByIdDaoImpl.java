package com.qf.dao.impl;

import com.qf.dao.UserSelectOneByIdDao;
import com.qf.pojo.User;

import java.sql.*;

public class UserSelectOneByIdDaoImpl implements UserSelectOneByIdDao {
    @Override
    public User selectOne(Integer id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf8&serverTimezone=UTC", "root", "root");
            preparedStatement = connection.prepareStatement("select * from user where u_id=?;");
            preparedStatement.setObject(1,id);
            resultSet = preparedStatement.executeQuery();
            User user = null;

            while (resultSet.next()){
                user = new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5));
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
        return null;
    }
}
