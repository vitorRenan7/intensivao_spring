package com.estudosspring.dslit.dto;

import com.estudosspring.dslit.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class GameMinDto {

    @Autowired
    Game game;

    private Long id;
    private String title;
    private Integer year;
    private String imgUlr;
    private String shortDescription;
}
