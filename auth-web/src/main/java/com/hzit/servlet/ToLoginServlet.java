package com.hzit.servlet;

import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;
import com.hzit.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/4.
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class ToLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        SqlSession sqlSession= SqlSessionHelper.getSqlSession();
        UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
        UserInfo user=new UserInfo();
        String userName =request.getParameter("username");
        String userPwd=request.getParameter("password");
        user.setuName(userName);
        user.setuPass(userPwd);
        UserInfo userInfo=userInfoDao.findUserById(user);
        if(userInfo !=null){
            request.getSession().setAttribute("user",userInfo);
            response.sendRedirect("index.html");
        }else{
            response.sendRedirect("login.html");
        }
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
