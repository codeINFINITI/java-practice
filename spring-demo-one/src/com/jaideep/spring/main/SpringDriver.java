package com.jaideep.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaideep.spring.model.Coach;

public class SpringDriver {

	public static void main(String[] args) {
		// Loading spring config
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// getting bean
		Coach coach = ctx.getBean("coach", Coach.class);

		// using bean
		System.out.println(coach.getDailyWorkout());
		// closing application context
		ctx.close();

	}

}
