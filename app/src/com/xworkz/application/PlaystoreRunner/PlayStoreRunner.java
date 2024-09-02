package com.xworkz.application.PlaystoreRunner;

import java.time.LocalDate;

import com.xworkz.application.Constant.PlaystoreNameconstant;
import com.xworkz.application.PlaystoreDto.PlayStoreDto;
import com.xworkz.application.Services.Playstoreservice;

public class PlayStoreRunner {
	public static void main(String[] args) {
		
		PlayStoreDto playstore =new PlayStoreDto();
		
		PlayStoreDto whatsapp=new PlayStoreDto(PlaystoreNameconstant.WHATSAPP.toString(),5.6,LocalDate.of(2022, 5, 18),LocalDate.of(2024, 8, 23));
		Playstoreservice service= new Playstoreservice();
		service.save(whatsapp);
		PlayStoreDto hotstar=new PlayStoreDto(PlaystoreNameconstant.HOTSTAR.toString(),3.6,LocalDate.of(2023, 6, 21),LocalDate.of(2023, 5, 23));
		service.save(hotstar);
		PlayStoreDto udemy=new PlayStoreDto(PlaystoreNameconstant.UDEMY.toString(),5.4,LocalDate.of(2022, 5, 18),LocalDate.of(2024, 4, 13));
		service.save(udemy);
		PlayStoreDto instagram=new PlayStoreDto(PlaystoreNameconstant.INSTAGRAM.toString(),5.3,LocalDate.of(2021, 5, 8),LocalDate.of(2023, 11, 10));
		service.save(instagram);
		
		service.read();
		
		service.search("HOTSTAR");
		service.search("fghi");
		
	}

}
