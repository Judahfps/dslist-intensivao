package com.guilherme.dslist_intensivao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.dslist_intensivao.dto.GameDTO;
import com.guilherme.dslist_intensivao.dto.GameMinDTO;
import com.guilherme.dslist_intensivao.services.GameService;

/*Esse controller vai ser a porta de entrada da nossa API, */

@RestController
@RequestMapping(value = "/games") /*Aqui estamos configurando o caminho da minha API*/
public class GameController {
	
	@Autowired
	private GameService gameService; /*Aqui estamos instaciando a nossa service, porque para acessar a service no controller precisamos fazer isso, respeitando as camadas*/
	
	
	@GetMapping(value= "/{id}") /*Vai ter um paramentro id aqui*/
	public GameDTO findById(@PathVariable Long id){
		
		GameDTO result = gameService.findById(id);
		return result;
		
	}
	
	
	@GetMapping
	public  List<GameMinDTO> findAll(){
		
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}
	
}
