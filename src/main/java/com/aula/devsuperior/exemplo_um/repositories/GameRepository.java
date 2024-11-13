package com.aula.devsuperior.exemplo_um.repositories;

import com.aula.devsuperior.exemplo_um.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
