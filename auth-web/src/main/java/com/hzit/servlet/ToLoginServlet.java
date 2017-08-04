package com.hzit.servlet;

import com.hzit.dao.ResourcesDao;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.Resources;
import com.hzit.entity.UserInfo;
import com.hzit.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
        ResourcesDao resourcesDao=sqlSession.getMapper(ResourcesDao.class);
        UserInfo user=new UserInfo();
        String userName =request.getParameter("username");
        String userPwd=request.getParameter("password");
        user.setuName(userName);
        user.setuPass(userPwd);
        UserInfo userInfo=userInfoDao.findUserById(user);
        if(userInfo !=null){
            //获取当前登录用户所拥有的资源
            List<Resources> reslist= resourcesDao.findResourcesByUser(userInfo.getuId());

            request.getSession().setAttribute("user",userInfo);
            request.getSession().setAttribute("reslist",reslist);
            response.sendRedirect("index.jsp");
        }else{
            response.sendRedirect("login.html");
        }
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
