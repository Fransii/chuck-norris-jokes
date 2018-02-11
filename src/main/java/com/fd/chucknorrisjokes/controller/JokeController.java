package com.fd.chucknorrisjokes.controller;

import com.fd.chucknorrisjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(@Qualifier("chuckNorrisJokeService") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "chucknorris";
    }
}
