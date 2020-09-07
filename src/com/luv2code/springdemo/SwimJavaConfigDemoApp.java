package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        //read Spring config Java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from Spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        //call a method on bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get dailyFortune
        System.out.println(theCoach.getDailyFortune());
    }
}
