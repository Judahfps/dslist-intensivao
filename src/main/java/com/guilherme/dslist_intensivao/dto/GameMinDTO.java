package com.guilherme.dslist_intensivao.dto;

import com.guilherme.dslist_intensivao.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	
	public GameMinDTO() {
		
	}


	public GameMinDTO(Game entity) {
		/*Como não temos a ambiguidade de id e dos demais, não presisamos usar o (this), que especifica qual o valor estar sendo passado.*/
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}


	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}
	
	
	


}
