package com.guilherme.dslist_intensivao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.guilherme.dslist_intensivao.dto.GameListDTO;
import com.guilherme.dslist_intensivao.entities.GameList;
import com.guilherme.dslist_intensivao.repositories.GameListRepository;


/*Vamos ter que resistrar essa class sendo como um componente do sistema, porque o framework que vai fazer uso dele. */

@Component /*Com essa anotação eu estou registrando minha service no sistema, ela poderia ser chamada de também de (Service), no lugar de (Component)*/


public class GameListService {
	
	/*A minha serve ela tem que retornar um DTO, de acordo com a minha camada de serviço*/
	
	@Autowired
	private GameListRepository gameLisRepository; /*Para chamar a camada de repository eu tenhom que ter uma instancia dela na minha service, aqui eu estou fazendo isso*/
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameLisRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	

}
