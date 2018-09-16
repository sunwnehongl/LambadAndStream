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
	
	/***
	 * 构造器
	 * @param userId 用户id
	 * @param userName 姓名
	 * @param sex 性别
	 * @param age 年龄
	 */
	public User(String userId,String userName,String sex,int age) {
		this.userId = userId;
		this.userName =userName;
		this.sex = sex;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "账号:"+this.userId+" 姓名:"+this.userName+" 性别"+this.sex+" 年龄"+this.age;
	}
	@Override
	public boolean equals(Object o) {
		User u = (User) o;
		return this.getUserId().equals(u.getUserId());
	} 
	@Override
	public int hashCode() {
		return this.getUserId().hashCode();
	}
}
