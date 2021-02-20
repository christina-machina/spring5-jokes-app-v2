package guru.springframework.norris.chuck.controllers;

import guru.springframework.norris.chuck.services.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", ""})
public class JokesController {

    private final ChuckNorrisService norrisService;

    public JokesController(ChuckNorrisService norrisService) {
        this.norrisService = norrisService;
    }

    public String getJokes(Model model){
        model.addAttribute("joke", norrisService.getJoke());
        return "index";
    }

}
