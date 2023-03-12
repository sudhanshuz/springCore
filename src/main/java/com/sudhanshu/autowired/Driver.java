package com.sudhanshu.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student student=context.getBean("StudentBean",Student.class);
		System.out.println(student);

	}

}
