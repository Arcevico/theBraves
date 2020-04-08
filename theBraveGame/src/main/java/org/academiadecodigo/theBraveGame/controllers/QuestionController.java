package org.academiadecodigo.theBraveGame.controllers;

import org.academiadecodigo.theBraveGame.questions.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class QuestionController {

    private Questions questions;

   @Autowired
    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    @RequestMapping(method = RequestMethod.GET, path = "questions/")
    public String test(Model model) {

        List questionsList = questions.questionsList();

        questions.getRandomQuestion(questionsList);

        model.addAttribute("question", questionsList);
        model.addAttribute("randomNumber", randomNumber());

        return "questions/question1";
    }

    public Integer randomNumber(){
        return (int)Math.floor(Math.random() * 17) + 1;
    }

}
