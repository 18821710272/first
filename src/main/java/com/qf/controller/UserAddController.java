package com.qf.controller;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.service.UserAddService;
import com.qf.service.impl.UserAddServiceImpl;
import com.qf.util.MyBatisUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class UserAddController extends HttpServlet {
//    UserAddService userAddService = new UserAddServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        String sex = req.getParameter("sex");
        String vip = req.getParameter("vip");

        User user = new User(null,name,pass,sex,Integer.valueOf(vip));
//        int add = userAddService.add(user);

        UserDao userDao = MyBatisUtils.getMapper(UserDao.class);
        int add = userDao.add(user);

        resp.sendRedirect("user");
    }
}
