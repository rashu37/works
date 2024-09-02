package com.xworkz.application.PlayStoreUtil;

import com.xworkz.application.PlaystoreDto.PlayStoreDto;

public class PlaystoreDuplicatecheck {

	
	public static boolean checkduplicate(PlayStoreDto[] playstoreDto,PlayStoreDto dto) {
	 System.out.println("Duplicate check");
	 for(PlayStoreDto playDto:playstoreDto) {
		 if(playDto !=null && playDto.equals(dto)) {
			 return true;
		 }
	 }
	 return false;
		 
	 }
	
}
