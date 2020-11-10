package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
//    @Override
//    public List<User> selectAll() {
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf8&serverTimezone=UTC", "root", "root");
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery("select * from user where 1=1;");
//            List<User> userList = new ArrayList<User>();
//
//            while (resultSet.next()){
//                User user = new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getInt(5));
//                userList.add(user);
//            }
//            return userList;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                resultSet.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public User selectOneByName(String name) {
        return null;
    }

    @Override
    public User selectOne(Integer id) {
        return null;
    }

    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public int del(Integer id) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }
}
