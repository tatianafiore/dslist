package com.fiore.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fiore.dslist.dto.GameDTO;
import com.fiore.dslist.dto.GameMinDTO;
import com.fiore.dslist.entities.Game;
import com.fiore.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true) //não vou fazer nenhuma operação de escrita. Não vou bloquear o banco de dados para escrita
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get(); 
		return new GameDTO(result);

	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO (x)).toList();
	 
    }
	
}