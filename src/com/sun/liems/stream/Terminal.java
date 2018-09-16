package com.sun.liems.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.liems.model.User;
import com.sun.liems.util.UserUtil;

/***
 * Stream终端操作
 * @author swh
 *
 */
public class Terminal {

	public static List<User> userList = UserUtil.getUserList();

	/***
	 * 把所有人员打印出来
	 */
	public static void forEach() {
		userList.stream()
		        .distinct()
		        .forEach(s->System.out.println(s));
	}
	
	public static void toArray() {
		User [] userArray = (User[]) userList.stream()
		        .distinct()
		        .toArray();
		Stream.of(userArray)
		      .forEach(s->System.out.println(s));
	}
	/***
	 * 求所有人员年龄的合
	 */
	public static void reduce() {
		int ageSum = userList.stream()
		        .map(u->u.getAge())
		        .reduce(0,(sum,u)-> sum+u);
		System.out.println(ageSum);
	}
	
	/***
	 * 求年龄最大的人员
	 */
	public static void max() {
		User user = userList.stream()
		        .max(Comparator.comparing(u->u.getAge()))
		        .get();
		System.out.println(user);
	}
	/**
	 * 把人员按性别分组
	 *
	 */
	public static void collect() {
		Map<Object, List<User>> map = userList.stream()
		            .collect(Collectors.groupingBy(u->u.getSex()));
		System.out.println(map.size());
	}
	/***
	 * 得到人员账号和年龄的对应关系
	 */
	public static void toMap() {
		Map<String, String> map = userList.stream()
		            .collect(Collectors.toMap(u->u.getUserId(), u->u.getUserName(),(a,b)->b));
		map.entrySet()
		   .forEach(e->{
			   System.out.println(e.getKey()+":"+e.getValue());
		   });
	}
	/***
	 * 匹配
	 */
	public static void match() {
		 // 是否包含张三
		 boolean flagA  = userList.stream()
		            .anyMatch(u->u.getUserName().equals("张三"));
		 System.out.println( flagA);
		 // 是否所以人都是18岁
		 boolean flagB  = userList.stream()
		            .allMatch(u->u.getAge()==18);
		 System.out.println( flagB);
		 // 是否所有人都是成年人
		 boolean flagC  = userList.stream()
		            .noneMatch(u->u.getAge()<18);
		 System.out.println(flagC);

	}
   public static void main(String args[]) {
	   match();
	}
}
