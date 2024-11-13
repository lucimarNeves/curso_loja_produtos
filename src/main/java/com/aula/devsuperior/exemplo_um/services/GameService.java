package com.aula.devsuperior.exemplo_um.services;


import com.aula.devsuperior.exemplo_um.DTO.GameDTO;
import com.aula.devsuperior.exemplo_um.entities.Game;
import com.aula.devsuperior.exemplo_um.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return  result.stream().map(GameDTO::new).toList();

    }

}
