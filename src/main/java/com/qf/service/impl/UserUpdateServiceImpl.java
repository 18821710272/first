package com.qf.service.impl;

import com.qf.dao.UserUpdateDao;
import com.qf.dao.impl.UserUpdateDaoImpl;
import com.qf.pojo.User;
import com.qf.service.UserUpdateService;

public class UserUpdateServiceImpl implements UserUpdateService {
    UserUpdateDao userUpdateDao = new UserUpdateDaoImpl();

    @Override
    public int update(User user) {
        return userUpdateDao.update(user);
    }
}
