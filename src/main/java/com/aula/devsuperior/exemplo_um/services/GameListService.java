package com.aula.devsuperior.exemplo_um.services;

import com.aula.devsuperior.exemplo_um.DTO.GameListDTO;
import com.aula.devsuperior.exemplo_um.entities.GameList;
import com.aula.devsuperior.exemplo_um.repositories.GameListRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return  result.stream().map(GameListDTO::new).toList();
    }
}
