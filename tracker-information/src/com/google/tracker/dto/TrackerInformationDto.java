package com.google.tracker.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class TrackerInformationDto {
	
	private int trackerId;
	private String productName;
	private String toLocation;
	private String fromLocation;
	private LocalDateTime packingdatetime;
	private LocalDateTime dispatcheddatetime;
	

}
