package org.academiadecodigo.theBraveGame.controllers;

import org.academiadecodigo.theBraveGame.questions.Questions;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Questions questions = new Questions();

        List<String> list = questions.questionsList();

        questions.getRandomQuestion(list);

        System.out.println(list);

        System.out.println(list.listIterator().next());

    }
}
