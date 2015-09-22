package com.spring.examples.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examples.Person;

public class ConstructorInjectionTest {
	private ApplicationContext context;
	
	@Before
	public void setup(){
		context = new ClassPathXmlApplicationContext("spring-beans.xml");
	}
	
	@Test
	public void greetTest(){
		Person person = (Person) context.getBean("personBean", Person.class);
		assertEquals("Neeraj", 				person.getFirstName());
		assertEquals("Girolkar", 			person.getLastName());
		assertEquals(28, 					person.getAge());
		assertEquals(5, 					person.getAddress().getPlotNo());
		assertEquals("Charlotte Street", 	person.getAddress().getStreet());
		assertEquals("London", 				person.getAddress().getCity());
		assertEquals("United Kingdom", 		person.getAddress().getCountry());
	}
	
	@After
	public void teardown(){
		context = null;
	}
}
