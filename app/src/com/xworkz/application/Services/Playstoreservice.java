package com.xworkz.application.Services;

import com.xworkz.application.PlayStoreUtil.PlaystoreDuplicatecheck;
import com.xworkz.application.PlaystoreDto.PlayStoreDto;

public class Playstoreservice {
	
	private PlayStoreDto[] playstoreDto=new PlayStoreDto[4];
	private int index=0;

	public String save(PlayStoreDto dto) {
		System.out.println("Saving method");
		if(dto==null) {
			System.out.println("not Saved Successfully");
			return "not saved";
		}else {
			boolean duplicateresult=PlaystoreDuplicatecheck.checkduplicate(playstoreDto,dto);
			System.out.println("duplicate results:"+duplicateresult);
			
			if(duplicateresult==false) {
				if(this.index<playstoreDto.length) {
					playstoreDto[index]=dto;
					index++;
					return "saved Successfully";
				}
			}
			
		}
			
	   return "not saved";
		
	}
	
	public void read() {
		for (PlayStoreDto dto : this.playstoreDto) {
			System.out.println(dto);
		}
		
		
	}
	
	public PlayStoreDto search(String applicationname) {
		System.out.println("Invoking Search");
		for(PlayStoreDto playDto:this.playstoreDto){
			
			if(playDto!=null ) {

				if(playDto.getApplicationName().equals(applicationname)) {
				System.out.println(playDto.getApplicationName()+":Present");
					return playDto;
				}
			}else{
				System.out.println(":Not Persent");
			return playDto;
			}
		}
      return null;
	}
}
