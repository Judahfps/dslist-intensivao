package com.guilherme.dslist_intensivao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.dslist_intensivao.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	/*Aqui vamos acessar os dados e devolver para service, a sua solicitação de dados, ou seja sua requisição*/

}

