package com.fiore.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiore.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
