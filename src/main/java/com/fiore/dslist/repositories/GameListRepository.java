package com.fiore.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiore.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
