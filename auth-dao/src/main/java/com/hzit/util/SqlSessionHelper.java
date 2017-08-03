package com.hzit.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

//дһ������SqlSession�Ĺ�����
public class SqlSessionHelper {
	private static SqlSession session;
	private static SqlSessionFactory factory;
	static Logger log=Logger.getLogger("SqlSessionHelper");
	static{
		Reader r;
		try {
			r = Resources.getResourceAsReader("mybatis.xml");

			log.debug("��ȡ�����ļ��ɹ�");
			factory=new SqlSessionFactoryBuilder().build(r);
			log.debug("Sqlsession���������ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SqlSession getSqlSession(){
		session=factory.openSession();
		log.debug("��ȡ��session����");
		return session;
	}
}
