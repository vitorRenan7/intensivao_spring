package com.estudosspring.dslit.controller;

import com.estudosspring.dslit.entities.Game;
import com.estudosspring.dslit.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<Game> findAll(){
        List<Game> result = gameService.findAll();
        return result;
    }
}
