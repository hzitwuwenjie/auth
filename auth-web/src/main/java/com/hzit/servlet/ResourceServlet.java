package com.hzit.servlet;

import com.hzit.dao.ResourcesDao;
import com.hzit.entity.Resources;
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
@WebServlet(name = "ResourceServlet",value = "/resourcelist")
public class ResourceServlet extends HttpServlet {
    ResourcesDao resourcesDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        resourcesDao= SqlSessionHelper.getSqlSession().getMapper(ResourcesDao.class);
            List<Resources> allresource=resourcesDao.findAllResource();
            SqlSessionHelper.closeSession();
            request.setAttribute("allresource", allresource);
            request.getRequestDispatcher("resource.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
