package com.example.jokeslib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {
    private List<String> jokList;
    private Random random;
    public Jokes() {
        jokList = new ArrayList<>();
        jokList.add("I got another letter from this lawyer today. It said “Final Notice”. Good that he will not bother me anymore.");
        jokList.add("I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.");
        jokList.add("Two donkeys are standing at a roadside, one asks the other: So, shall we cross?\n" +
                "-\n" +
                "The other shakes his head: \"No way, look at what happened to the zebra.\"");
       jokList.add("One company owner asks another: “Tell me, Bill, how come your employees are always on time in the mornings?”\n" +
               "\n" +
               "Bill replies: “Easy. 30 employees and 20 parking spaces.");
        jokList.add("Doctor: “Can you describe the snake that bit you?”\n" +
                "-\n" +
                "Patient: “Yes. It looked like an angry rope. ");
       random=new Random();
    }
    public String getRandomJoke(){
        return jokList.get(random.nextInt(jokList.size()));
    }

}
