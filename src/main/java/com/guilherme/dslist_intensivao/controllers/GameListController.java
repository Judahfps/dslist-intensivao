package com.guilherme.dslist_intensivao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.dslist_intensivao.dto.GameListDTO;
import com.guilherme.dslist_intensivao.dto.GameMinDTO;
import com.guilherme.dslist_intensivao.services.GameListService;
import com.guilherme.dslist_intensivao.services.GameService;

/*Esse controller vai ser a porta de entrada da nossa API, */

@RestController
@RequestMapping(value = "/lists") /*Aqui estamos configurando o caminho da minha API*/
public class GameListController {
	
	@Autowired
	private GameListService gameListService; /*Aqui estamos instaciando a nossa service, porque para acessar a service no controller precisamos fazer isso, respeitando as camadas*/
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public  List<GameListDTO> findAll(){
		
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{listId}/games")
	public  List<GameMinDTO> findByList(@PathVariable Long listId){
		
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
		
	}
	
	
}
