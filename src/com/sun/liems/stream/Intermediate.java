package com.sun.liems.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.liems.model.User;
import com.sun.liems.util.UserUtil;

/***
 * Stream的一些中间操作的例子类
 * @author swh
 *
 */
public class Intermediate {

	public static List<User> userList = UserUtil.getUserList();
	
	/***
	 * 把一个人员转换成一个字符串
	 * @return
	 */
	public static List<String> map(){
		return userList.stream()
		        .map(s->{
		        	return s.toString();
		        })
		        .collect(Collectors.toList());
	}
	
	public static void flatMap(){
        String[] words = new String[]{"Hello","World"};
        words.hashCode();
        List<String> a = Arrays.stream(words)
                .map(word -> word.split(""))
                .flatMap(s->Arrays.stream(s))
                .collect(Collectors.toList());
        a.forEach(System.out::print);
	}
	
	/***
	 * 去除人员数组中的所有女性
	 * @return
	 */
	public static List<User> filter(){
		return userList.stream()
		        .filter(s->s.getSex().equals("男"))
		        .collect(Collectors.toList());
	}
	
	/***
	 * 把重复账号Id的去掉
	 * @return
	 */
	public static List<User> distinct(){
		return userList.stream()
		        .distinct()
		        .collect(Collectors.toList());
	}
	
	/***
	 * 把人员按年龄排序
	 * @return
	 */
	public static List<User> sorted(){
		return userList.stream()
		        .sorted(Comparator.comparing(s->s.getAge()))
		        .collect(Collectors.toList());
	}
	/***
	 * 返回所有男性并打印出来
	 * @return
	 */
	public static List<User> peek(){
		return userList.stream()
				.filter(s->s.getSex().equals("男"))
				.peek(s->System.out.println(s))
		        .collect(Collectors.toList());
	}
	/***
	 * 取前4个用户
	 * @return
	 */
	public static List<User> limit(){
		return userList.stream()
                .limit(4)
				.collect(Collectors.toList());
	}
	
	/***
	 * 取出了前4个后面的用户
	 * @return
	 */
	public static List<User> skip(){
		return userList.stream()
                .skip(4)
				.collect(Collectors.toList());
	}
	public static void main(String args[]) {
		skip().forEach(s->System.out.println(s));;
	}
}
