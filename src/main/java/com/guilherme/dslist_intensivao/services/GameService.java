package com.guilherme.dslist_intensivao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.guilherme.dslist_intensivao.Game;
import com.guilherme.dslist_intensivao.dto.GameMinDTO;
import com.guilherme.dslist_intensivao.repositories.GameRepository;

/*Vamos ter que resistrar essa class sendo como um componente do sistema, porque o framework que vai fazer uso dele. */

@Component /*Com essa anotação eu estou registrando minha service no sistema, ela poderia ser chamada de também de (Service), no lugar de (Component)*/


public class GameService {
	
	/*A minha serve ela tem que retornar um DTO, de acordo com a minha camada de serviço*/
	
	@Autowired
	private GameRepository gameRepository; /*Para chamar a camada de repository eu tenhom que ter uma instancia dela na minha service, aqui eu estou fazendo isso*/
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	

}
