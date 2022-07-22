package com.jaideep.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaideep.spring.model.Coach;

public class BeanScopeDriver {
	public static void main(String[] args) {
		// load spring configfile"
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// getting bean
		Coach coach = ctx.getBean("coach", Coach.class);

		Coach alphaCoach = ctx.getBean("coach", Coach.class);
		System.out.println(coach.toString());
		System.out.println(alphaCoach.toString());
		if (coach.equals(alphaCoach)) {
			System.out.println("coach and aplha coach are same: same memory ref as singleton");

		} else {
			System.out.println("coach and aplha coach are different: different memory ref as prototype");
		}

		// using bean

		// closing application context
		ctx.close();
	}
}
