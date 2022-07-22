package com.jaideep.spring.model;

public class BaseBallCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Throw practice for 30 minutes";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
