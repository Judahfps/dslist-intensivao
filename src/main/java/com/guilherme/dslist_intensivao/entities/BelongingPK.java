package com.guilherme.dslist_intensivao.entities;
/*
 * Essa classe foi criada como uma class de associação, porque na class Repository eu não posso ter mas de uma produto com Id como chave primaria.
 * Por isso essa classe foi criada para representar uma chave primaria multipla.
 * 
 * @ManyToAn @JoinColumn com esse dois estamos mapeando o id do pedido_id e produto_id, que no nosso caso é game_id e list_id.
 * @Embeddable com esse cara vamos representar dois campos da tabela com chave primaria, eu estou encapsolando dois produtos em uma class só.
 * */


import java.util.Objects;


import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList lis;
		
	public BelongingPK() {
		
	}


	public BelongingPK(Game game, GameList lis, Integer position) {
		this.game = game;
		this.lis = lis;
	}


	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}


	public GameList getLis() {
		return lis;
	}


	public void setLis(GameList lis) {
		this.lis = lis;
	}


	@Override
	public int hashCode() {
		return Objects.hash(game, lis);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(lis, other.lis);
	}
	
	
	

}
