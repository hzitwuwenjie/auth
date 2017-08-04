package com.hzit.servlet;

import com.hzit.dao.ResourcesDao;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.Resources;
import com.hzit.entity.UserInfo;
import com.hzit.util.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */
@WebServlet(name = "GetResourcesByUserServlet",urlPatterns = "/getResourcesByUser")
public class GetResourcesByUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
        ResourcesDao resourcesDao=SqlSessionHelper.getSqlSession().getMapper(ResourcesDao.class);
        UserInfoDao userInfoDao=SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        if(userInfo !=null){
            //获取当前登录用户所拥有的资源
            List<Resources> reslist= resourcesDao.findResourcesByUser(userInfo.getuId());
            request.getSession().setAttribute("reslist", reslist);
            List<UserInfo> userList=userInfoDao.findAllUser();
            request.setAttribute("userList",userList);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}
