package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserUpdateService;
import com.qf.service.impl.UserUpdateServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UserUpdateController extends HttpServlet {
    UserUpdateService userUpdateService = new UserUpdateServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        String sex = req.getParameter("sex");
        String vip = req.getParameter("vip");

        User user = new User(Integer.valueOf(id),name,pass,sex,Integer.valueOf(vip));
        int update = userUpdateService.update(user);

        resp.sendRedirect("user");
    }
}
