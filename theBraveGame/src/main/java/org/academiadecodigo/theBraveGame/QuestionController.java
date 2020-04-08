package org.academiadecodigo.theBraveGame;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuestionController {

    @RequestMapping(method = RequestMethod.GET, path = "questions/")
public String test(){

    return "questions/question1";
}

}
