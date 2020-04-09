package org.academiadecodigo.theBraveGame.controllers;

import org.academiadecodigo.theBraveGame.quiz.Answers;
import org.academiadecodigo.theBraveGame.quiz.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class QuestionController {

    private Questions questions;
    private Answers answers;
    private Integer counter = 0;
    private Integer points = 0;

    @Autowired
    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    @Autowired
    public void setAnswers(Answers answers) {
        this.answers = answers;
    }

    @RequestMapping(method = RequestMethod.GET, path = "questions/")
    public String test(Model model) {

        List questionsList = questions.questionsList();

        model.addAttribute("question", questionsList);

        while (counter <= 10) {

            String randomQuestion = questions.getRandomQuestion(questionsList);
            String points2 = "You have 5 points";


            model.addAttribute("randomQuestion", randomQuestion);
            model.addAttribute("counter", counter);
           // model.addAttribute("answer", Answers.getQuestion1Answer2());
            model.addAttribute("points", points);
            model.addAttribute("pointsMessage", points2);
            model.addAttribute("answers", answers.answerList());

            counter++;

            return "questions/question1";
        }
        counter = 0;
        points = 0;
        return "endPage/endPage";
    }
}
