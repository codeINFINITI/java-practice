package com.jaideep.spring.model;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim practice for 20 minutes morning and evening";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

}
