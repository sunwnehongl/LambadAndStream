package com.sun.liems.model;

/***
 * 人员类主要用于lambda表达式和Stream练习使用
 * @author swh
 *
 */
public class User {
	// 账号ID
	private String userId;
	// 用户姓名
	private String userName;
	// 性别
	private String sex;
	// 年龄
	private int age;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
