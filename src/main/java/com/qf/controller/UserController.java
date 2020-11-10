package com.qf.controller;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.service.impl.UserServiceImpl;
import com.qf.util.MyBatisUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        UserService userService = new UserServiceImpl();
//        List<User> users = userService.selectAll();

        UserDao userDao = MyBatisUtils.getMapper(UserDao.class);
        List<User> users = userDao.selectAll();

        req.setAttribute("users",users);
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }
}
