package org.academiadecodigo.theBraveGame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "redirect:startPage/";
    }

    @RequestMapping(method = RequestMethod.GET, path = "startPage/")
    public String test() {

        return "startPage/mainPage";
    }
}
