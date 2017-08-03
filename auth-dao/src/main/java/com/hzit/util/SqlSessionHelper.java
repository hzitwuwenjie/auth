package com.hzit.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

//写一个产生SqlSession的工具类
public class SqlSessionHelper {
    private static SqlSession session;
    private static SqlSessionFactory factory;
    static Logger log = Logger.getLogger("SqlSessionHelper");

    static {
        Reader r;
        try {
            r = Resources.getResourceAsReader("mybatis-config.xml");

            log.debug("读取配置文件成功");
            factory = new SqlSessionFactoryBuilder().build(r);
            log.debug("Sqlsession工厂创建成功");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        if (session == null) {
            session = factory.openSession();
            log.debug("获取了session对象");
        }
        return session;
    }

    public static void closeSession() {
        if (session != null)
            session.close();
        session = null;
    }


}
