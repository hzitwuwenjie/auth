package com.hzit.servlet;

import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;
import com.hzit.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/4.
 */
@WebServlet(name = "DeleteUserServlet",urlPatterns = "/deleteUserById")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        SqlSession sqlSession=SqlSessionHelper.getSqlSession();
        UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
        int userId=Integer.parseInt(request.getParameter("userId"));
        int i=userInfoDao.deleteUserRole(userId);
        if (i<=0){
            sqlSession.rollback();
        }else{
            i=userInfoDao.deleteUser(userId);
            if (i==1){
                sqlSession.commit();
            }else {
                sqlSession.rollback();
            }
        }
        response.sendRedirect("getResourcesByUser");
    }
}
