package com.aula.devsuperior.exemplo_um.controller;

import com.aula.devsuperior.exemplo_um.DTO.GameDTO;
import com.aula.devsuperior.exemplo_um.DTO.GameListDTO;
import com.aula.devsuperior.exemplo_um.DTO.GameMaxDTO;
import com.aula.devsuperior.exemplo_um.services.GameListService;
import com.aula.devsuperior.exemplo_um.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return  result;
    }

}
