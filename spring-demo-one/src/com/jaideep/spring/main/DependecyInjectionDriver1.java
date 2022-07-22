package com.jaideep.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaideep.spring.model.Coach;

public class DependecyInjectionDriver1 {

	public static void main(String[] args) {

		// load spring configfile"
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// getting bean
		Coach coach = ctx.getBean("coach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());

		// using bean

		// closing application context
		ctx.close();
	}
}
