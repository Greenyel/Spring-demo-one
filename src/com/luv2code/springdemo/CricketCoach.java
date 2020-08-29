package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //non-argument constructor for Spring to call this constructor
    //when he(Spring) will make a reference ot CricketCoach bean
    public CricketCoach(){
        System.out.println("CricketCoach: inside non-argument constructor ");
    }
    //setter method for dependency injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setFortuneService method ");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
