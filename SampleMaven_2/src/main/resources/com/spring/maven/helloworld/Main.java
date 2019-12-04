package com.spring.maven.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContex beanFactory  = new ClassPathXmlApplicationContext("/resources/hello.xml");
		
		HelloWorld mybean=(HelloWorld) beanFactory.getBean("Spring3");
		myBean.printHello();
	}
}
