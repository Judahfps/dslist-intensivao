package com.guilherme.dslist_intensivao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.guilherme.dslist_intensivao.entities.Game;
import com.guilherme.dslist_intensivao.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	/*Aqui vamos acessar os dados e devolver para service, a sua solicitação de dados, ou seja sua requisição*/
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);

}

