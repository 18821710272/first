package com.qf.service.impl;

import com.qf.dao.UserDelDao;
import com.qf.dao.impl.UserDelDaoImpl;
import com.qf.service.UserDelService;

public class UserDelServiceImpl implements UserDelService {
    UserDelDao userDelDao = new UserDelDaoImpl();

    @Override
    public int del(Integer id) {
        return userDelDao.del(id);
    }
}
