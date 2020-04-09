package org.academiadecodigo.theBraveGame.quiz;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Answers {
    private static final String QUESTION1_ANSWER1 = "1";
    private static final String QUESTION1_ANSWER2 = "2";
    private static final String QUESTION2_ANSWER1 = "1";
    private static final String QUESTION2_ANSWER2 = "2";
    private static final String QUESTION3_ANSWER1 = "1";
    private static final String QUESTION3_ANSWER2 = "2";
    private static final String QUESTION4_ANSWER1 = "1";
    private static final String QUESTION4_ANSWER2 = "2";
    private static final String QUESTION5_ANSWER1 = "1";
    private static final String QUESTION5_ANSWER2 = "2";
    private static final String QUESTION6_ANSWER1 = "1";
    private static final String QUESTION6_ANSWER2 = "2";
    private static final String QUESTION7_ANSWER1 = "1";
    private static final String QUESTION7_ANSWER2 = "2";
    private static final String QUESTION8_ANSWER1 = "1";
    private static final String QUESTION8_ANSWER2 = "2";
    private static final String QUESTION9_ANSWER1 = "1";
    private static final String QUESTION9_ANSWER2 = "2";
    private static final String QUESTION10_ANSWER1 = "1";
    private static final String QUESTION10_ANSWER2 = "2";
    private static final String QUESTION11_ANSWER1 = "1";
    private static final String QUESTION11_ANSWER2 = "2";
    private static final String QUESTION12_ANSWER1 = "1";
    private static final String QUESTION12_ANSWER2 = "2";


    public static List<String> answerList(){
        List<String> answersList = new ArrayList();
        answersList.add(QUESTION1_ANSWER1);
        answersList.add(QUESTION1_ANSWER2);
        answersList.add(QUESTION2_ANSWER1);
        answersList.add(QUESTION2_ANSWER2);
        return answersList;
    }

    public static String getQuestion1Answer2() {
        return QUESTION1_ANSWER2;
    }

    public static String getQuestion1Answer1() {
        return QUESTION1_ANSWER1;
    }

    public static String getQuestion2Answer1() {
        return QUESTION2_ANSWER1;
    }

    public static String getQuestion2Answer2() {
        return QUESTION2_ANSWER2;
    }

    public static String getQuestion3Answer1() {
        return QUESTION3_ANSWER1;
    }

    public static String getQuestion3Answer2() {
        return QUESTION3_ANSWER2;
    }

    public static String getQuestion4Answer1() {
        return QUESTION4_ANSWER1;
    }

    public static String getQuestion4Answer2() {
        return QUESTION4_ANSWER2;
    }

    public static String getQuestion5Answer1() {
        return QUESTION5_ANSWER1;
    }

    public static String getQuestion5Answer2() {
        return QUESTION5_ANSWER2;
    }

    public static String getQuestion6Answer1() {
        return QUESTION6_ANSWER1;
    }

    public static String getQuestion6Answer2() {
        return QUESTION6_ANSWER2;
    }

    public static String getQuestion7Answer1() {
        return QUESTION7_ANSWER1;
    }

    public static String getQuestion7Answer2() {
        return QUESTION7_ANSWER2;
    }

    public static String getQuestion8Answer1() {
        return QUESTION8_ANSWER1;
    }

    public static String getQuestion8Answer2() {
        return QUESTION8_ANSWER2;
    }

    public static String getQuestion9Answer1() {
        return QUESTION9_ANSWER1;
    }

    public static String getQuestion9Answer2() {
        return QUESTION9_ANSWER2;
    }

    public static String getQuestion10Answer1() {
        return QUESTION10_ANSWER1;
    }

    public static String getQuestion10Answer2() {
        return QUESTION10_ANSWER2;
    }

    public static String getQuestion11Answer1() {
        return QUESTION11_ANSWER1;
    }

    public static String getQuestion11Answer2() {
        return QUESTION11_ANSWER2;
    }

    public static String getQuestion12Answer1() {
        return QUESTION12_ANSWER1;
    }

    public static String getQuestion12Answer2() {
        return QUESTION12_ANSWER2;
    }
}
