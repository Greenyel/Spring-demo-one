package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside doMyStartupStuff()");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanStuff() {
        System.out.println(">> TennisCoach: inside doMyCleanStuff()");
    }

    //define a setter method for injections
    /*@Autowired
    public void doSomeStuff(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside doSomeStuff method");
        this.fortuneService = fortuneService;
    }/*

    /*@Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
