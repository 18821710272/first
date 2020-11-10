package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> selectAll();

    User selectOneByName(@Param("name") String name);

    User selectOne(@Param("id") Integer id);

    int add(User user);

    int del(@Param("id") Integer id);

    int update(User user);
}
