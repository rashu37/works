package com.google.tv.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TvDto {
	
	private int id;
	private String title;
    private String language;
    private int reviews;
    private int ratings;
    private String availableOn;
    private String createdBy;
    

}
