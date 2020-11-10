package com.qf.controller;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.service.UserSelectOneByIdService;
import com.qf.service.impl.UserSelectOneByIdServiceImpl;
import com.qf.util.MyBatisUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectOneById")
public class UserSelectOneByIdController extends HttpServlet {
//    UserSelectOneByIdService userSelectOneByIdService = new UserSelectOneByIdServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
//        User user = userSelectOneByIdService.selectOne(Integer.valueOf(id));

        UserDao userDao = MyBatisUtils.getMapper(UserDao.class);
        User user = userDao.selectOne(Integer.valueOf(id));

        req.setAttribute("user",user);
        req.getRequestDispatcher("detail.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
