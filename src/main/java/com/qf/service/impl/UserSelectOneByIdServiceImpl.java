package com.qf.service.impl;

import com.qf.dao.UserSelectOneByIdDao;
import com.qf.dao.impl.UserSelectOneByIdDaoImpl;
import com.qf.pojo.User;
import com.qf.service.UserSelectOneByIdService;

public class UserSelectOneByIdServiceImpl implements UserSelectOneByIdService {
    UserSelectOneByIdDao userSelectOneByIdDao = new UserSelectOneByIdDaoImpl();

    @Override
    public User selectOne(Integer id) {
        return userSelectOneByIdDao.selectOne(id);
    }
}
