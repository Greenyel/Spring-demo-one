package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    //fields for emailAddress and teamName String injection
    private String emailAddress;
    private String teamName;

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setEmailAddress method ");
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        System.out.println("CricketCoach: inside setTeamName method ");
        this.teamName = teamName;
    }
}
