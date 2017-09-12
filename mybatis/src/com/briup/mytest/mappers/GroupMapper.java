package com.briup.mytest.mappers;

import java.util.List;

import com.briup.mytest.pojo.Group;
import com.briup.mytest.pojo.User;


/**
 * 夫妻接口
 * 
 * @author LZP
 *
 * 2017年9月6日
 */

public interface GroupMapper {
	List<Group> findAll();
	void insertUesr(User user,Integer i);

}
