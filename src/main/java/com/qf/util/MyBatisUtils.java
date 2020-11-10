package com.qf.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory =null;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SqlSession openSession() {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }

    public static <T extends Object> T getMapper(Class<T> clazz){
        SqlSession sqlSession = openSession();
        return sqlSession.getMapper(clazz);
    }
}
