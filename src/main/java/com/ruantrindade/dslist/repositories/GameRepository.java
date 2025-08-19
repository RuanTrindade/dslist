package com.ruantrindade.dslist.repositories;

import com.ruantrindade.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
