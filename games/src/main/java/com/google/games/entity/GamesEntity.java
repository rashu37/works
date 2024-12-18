package com.google.games.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity
@Data
@NamedQueries({@NamedQuery(name = "findAll", query = "SELECT i FROM GamesEntity i"),
	@NamedQuery(name="findByName", query="SELECT entity from GamesEntity entity WHERE entity.gamename=:game")})


public class GamesEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="game_name")
	private String gamename;
	
	@Column(name="palyers_ofNumbers")
    private int noOfPlayers;
	
	@Column(name="mimage")
    private int minAge;
	
	@Column(name="price")
    private int price;
    
	@Column(name="ratings")
    private int ratings;
	
	@Column(name="gameDay")
    private LocalDateTime gameDay;
	
	@Column(name="created_by")
    private String createdBy;

}
