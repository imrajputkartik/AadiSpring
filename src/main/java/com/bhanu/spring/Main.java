package com.bhanu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhanu.spring.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		Student bean1 = ioc.getBean("s1", Student.class);

		System.out.println(bean1);

	}

}
