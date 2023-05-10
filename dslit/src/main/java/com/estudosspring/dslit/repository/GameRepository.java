package com.estudosspring.dslit.repository;

import com.estudosspring.dslit.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{
}

//Objeto responsavel por fazer consultas no banco de dados
