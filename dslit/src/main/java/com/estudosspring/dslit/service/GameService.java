package com.estudosspring.dslit.service;

import com.estudosspring.dslit.dto.GameMinDto;
import com.estudosspring.dslit.entities.Game;
import com.estudosspring.dslit.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<Game>findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}

//Service - É um componente responsável por implementar lógica de negócio; (Regras que precisam acontecer)
