package com.NepalCode.SpringDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		// setter injection
		/*Student s= new Student();
		s.setStudentName("Madna");
		s.setStuid(1);
		s.displayInfo();
		*/
		
		// constructor injection
		/*Student stu= new Student("MadanGG", 1);
		stu.displayInfo();
		*/
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student s = context.getBean("student", Student.class);
		s.displayInfo();
		Student s1 =context.getBean("student1", Student.class);
		s1.displayInfo();
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student s = context.getBean("student", Student.class);
		s.displayInfo();
		
		Student s1= context.getBean("student1",Student.class);
		s1.displayInfo();
		

	}

}
