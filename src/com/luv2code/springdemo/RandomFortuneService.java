package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //create an array of Strings
    private String data[] = {
            "Beware of the wolf in sheep's clothing",
            "Diligence",
            "The journey is th"
    };

    //create a random number generator
    private Random random = new Random();

    public RandomFortuneService(){
        System.out.println("RandomFortuneService: inside constructor");
    }
    @Override
    public String getFortune() {   //pick a random string from the array
        int index = random.nextInt(data.length);

        String theFortune = data[index];
        return theFortune;
    }
}
