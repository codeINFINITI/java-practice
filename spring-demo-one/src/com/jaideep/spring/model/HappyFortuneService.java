package com.jaideep.spring.model;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day bro!!";
	}

}
