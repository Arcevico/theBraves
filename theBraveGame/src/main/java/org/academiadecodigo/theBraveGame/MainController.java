package org.academiadecodigo.theBraveGame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "redirect:startPage/";
    }


    }
}
