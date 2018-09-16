package com.sun.liems.util;

import java.util.ArrayList;
import java.util.List;

import com.sun.liems.model.User;

/***
 * 人员的工具类主要获取一个人员集合
 * @author swh
 *
 */
public class UserUtil {

	/***
	 * 得到一个人员集合
	 * @return
	 */
	public static List<User> getUserList(){
		List<User> userList = new ArrayList<>();
		userList.add(new User("ZS","张三","男",18));
		userList.add(new User("ZS","张三","男",18));
		userList.add(new User("LS","李四","男",19));
		userList.add(new User("WW","王五","男",20));
		userList.add(new User("XL","小丽","女",18));
		userList.add(new User("DL","大丽","女",19));
		return userList;
	}
}
