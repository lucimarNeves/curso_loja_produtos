package com.aula.devsuperior.exemplo_um.repositories;

import com.aula.devsuperior.exemplo_um.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
