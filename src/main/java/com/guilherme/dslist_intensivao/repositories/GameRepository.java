package com.guilherme.dslist_intensivao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.dslist_intensivao.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	/*Aqui vamos acessar os dados e devolver para service, a sua solicitação de dados, ou seja sua requisição*/

}

