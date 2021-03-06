package com.rdcentermrzhi.java.demo.object;

import com.rdcentermrzhi.java.demo.stream.Student;

public class TestObject {

	public static void main(String[] args) {
		
		
		//java 对象name 类似于c++ 中的对象指针   所以java 方法调用都是值传递 不过 调用对象传递的 指针指向的地址
		Student st = new Student("abc",1212);
		
		Student st2 =  st;
		st2.setName("122122");
		System.out.println(st2);
		mdifyAge(st2);
		System.out.println(st2);
		
		//类似于c++ 一级指针 方法传递时不能修改指针指向， 改变指针需要传入指针的地址  
		mdifyObject(st2);
		System.out.println(st2);
		
	}
	
	
	
	
	
	public static void mdifyAge(Student st) {
		st.setAge(st.getAge() + 10);
	}
	
	public static void mdifyObject(Student st) {
	     Student sn = new Student("xxx",101);
	     st = sn;
	}
	
}
