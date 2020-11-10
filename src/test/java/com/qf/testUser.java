package com.qf;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.util.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class testUser {

    @Test
    public void testOne(){
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserDao userDao = sqlSession.getMapper(UserDao.class);
//        User user = userDao.selectOneByName("汪伟");
//        System.out.println(user);

        UserDao userDao = MyBatisUtils.getMapper(UserDao.class);
        User user = userDao.selectOneByName("陈青帝");
        System.out.println(user);
    }
}
