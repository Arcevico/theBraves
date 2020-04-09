package org.academiadecodigo.theBraveGame.quiz;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class Questions {
    private final static String QUESTION1 = "1";
    private final static String QUESTION2 = "2";
    private final static String QUESTION3 = "3";
    private final static String QUESTION4 = "4";
    private final static String QUESTION5 = "5";
    private final static String QUESTION6 = "6";
    private final static String QUESTION7 = "7";
    private final static String QUESTION8 = "8";
    private final static String QUESTION9 = "9";
    private final static String QUESTION10 = "10";
    private final static String QUESTION11 = "11";
    private final static String QUESTION12 = "12";
    private final static String QUESTION13 = "13";
    private final static String QUESTION14 = "14";
    private final static String QUESTION15 = "15";
    private final static String QUESTION16 = "16";
    private final static String QUESTION17 = "17";

    public String getRandomQuestion(List<String> list){
        Collections.shuffle(list);
        return list.listIterator().next();
    }

    public List<String> questionsList(){

        List<String> questionsList = new ArrayList<>();

        questionsList.add(QUESTION1);
        questionsList.add(QUESTION2);
        questionsList.add(QUESTION3);
        questionsList.add(QUESTION4);
        questionsList.add(QUESTION5);
        questionsList.add(QUESTION6);
        questionsList.add(QUESTION7);
        questionsList.add(QUESTION8);
        questionsList.add(QUESTION9);
        questionsList.add(QUESTION10);
        questionsList.add(QUESTION11);
        questionsList.add(QUESTION12);
        questionsList.add(QUESTION13);
        questionsList.add(QUESTION14);
        questionsList.add(QUESTION15);
        questionsList.add(QUESTION16);
        questionsList.add(QUESTION17);

        return questionsList;
    }

}
