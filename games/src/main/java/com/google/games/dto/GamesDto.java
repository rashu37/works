package com.google.games.dto;


import java.time.LocalDateTime;

import lombok.Data;
@Data
 public class GamesDto {
	
	 private int id;
     private String gamename;
     private int noOfPlayers;
     private int minAge;
     private int price;
     private int ratings;
     private LocalDateTime gameDay;
     private String createdBy;
}
