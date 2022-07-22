package com.jaideep.spring.main;

import com.jaideep.spring.model.BaseBallCoach;
import com.jaideep.spring.model.Coach;

public class Driver1 {
	public static void main(String[] args) {
		Coach coach=new BaseBallCoach();
		System.out.println(coach.getDailyWorkout());
	}
}
