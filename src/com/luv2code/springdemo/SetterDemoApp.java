package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args){

        //load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from string container
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on bean will be used later
        System.out.println(cricketCoach.getDailyWorkout());

        System.out.println(cricketCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
