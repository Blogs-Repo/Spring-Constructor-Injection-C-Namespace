package com.spring.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.Person;

public class Main {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Person person = (Person) context.getBean("personBean", Person.class);
		System.out.println(person.getFirstName());
	}
}
