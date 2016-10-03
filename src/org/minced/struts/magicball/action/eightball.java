package org.minced.struts.magicball.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Random;

/**
 * Created by rob on 9/25/16.
 * Assignment 1.
 */
public class eightball extends ActionSupport{
    /*
    Pulled from https://en.wikipedia.org/wiki/Magic_8-Ball
    * */
    private String [] messageList=
            { "It is certain", "It is decidedly so", "Without a doubt",
              "Yes, definitely","You may rely on it","As I see it, yes",
              "Most likely","Outlook good","Yes","Signs point to yes",
              "Reply hazy try again", "Ask again later","Better not tell you now",
              "Cannot predict now","Concentrate and ask again","Don't count on it",
              "My reply is no","My sources say no","Outlook not so good","Very doubtful"
            };
    private String yourFortune;
    private Random rand = new Random();
    private final int POSSIBLE_ANSWER_AMOUNT = 20;

    public String execute() throws Exception{

        int   random = rand.nextInt(POSSIBLE_ANSWER_AMOUNT);
        setYourFortune(messageList[random]);
        return "success";
    }
    private void setYourFortune(String fortune){
        this.yourFortune = fortune;
    }
    public String getYourFortune(){
        return yourFortune;
    }

}
