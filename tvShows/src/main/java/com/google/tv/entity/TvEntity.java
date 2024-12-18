package com.google.tv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Data;

@Entity
@Data
@NamedQueries({@NamedQuery(name="findAll", query="select t from TvEntity t"),
	@NamedQuery(name="findByTitle", query="select entity from TvEntity entity where tv_name=:showName")})

public class TvEntity {
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="tv_name")
	private String title;
	
	@Column(name="language")
    private String language;
	
	@Column(name="reviews")
    private int reviews;
	
	@Column(name="ratings")
    private int ratings;
	
	@Column(name="avilableOn")
    private String availableOn;
	
	@Column(name="createdBy")
    private String createdBy;

}
