package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //load Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from Spring container
        Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        Coach alphaCoach = context.getBean("tennisCoach", TennisCoach.class);

        //check if they are the same
        boolean result = (theCoach == alphaCoach);

        //print the result
        System.out.println("Pointing to the same object: " + result);

        System.out.println("Memory location for theCoach: " + theCoach);

        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        //close the context
        context.close();
    }
}
