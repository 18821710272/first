package com.qf.service.impl;

import com.qf.dao.UserAddDao;
import com.qf.dao.impl.UserAddDaoImpl;
import com.qf.pojo.User;
import com.qf.service.UserAddService;

public class UserAddServiceImpl implements UserAddService {
    UserAddDao userAddDao = new UserAddDaoImpl();

    @Override
    public int add(User user) {
        return userAddDao.add(user);
    }
}
