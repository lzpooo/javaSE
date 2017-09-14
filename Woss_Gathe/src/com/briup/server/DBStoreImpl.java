package com.briup.server;

import java.util.Collection;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;

import com.briup.mybatis.mappers.Mapper;
import com.briup.mybatis.utils.WossSqlSessionFactory;
import com.briup.util.BIDR;
import com.briup.woss.server.DBStore;

/**
 * 执行入库操作
 */
public class DBStoreImpl implements DBStore {

	@Override
	public void init(Properties prop) {
		prop.getProperty("");
	}

	/*
	 * 入库
	 */
	@Override
	public void saveToDB(Collection<BIDR> bidr) throws Exception {
		SqlSession sqlSession = null;
		sqlSession = WossSqlSessionFactory.openSession();
		Mapper mapper = sqlSession.getMapper(Mapper.class);
		for (BIDR b : bidr) {
			@SuppressWarnings("deprecation")
			int day = b.getLogin_date().getDate();
			String str = "t_detail_" + day;
			mapper.insertBIDR(b, str);
			sqlSession.commit();
		}
		if (sqlSession != null) {
			sqlSession.close();
		}

	}

}
