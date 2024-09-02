package com.google.application.service;

import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

import com.google.application.dto.MallsDto;
import com.google.application.util.MallsDuplicateCheck;

public class MallsService {

	private MallsDto[] mallsdto = new MallsDto[3];
	private int index = 0;

	public String save(MallsDto dto) {
		System.out.println("Saving Method");
		if (dto == null) {
			System.out.println("Not saved");
			return "not saved";
		} else {
			boolean duplicateresults = MallsDuplicateCheck.checkduplicate(mallsdto, dto);
			System.out.println("Duplicate result:" + duplicateresults);

			if (duplicateresults == false) {
				if (this.index < mallsdto.length) {
					mallsdto[index] = dto;
					index++;
					return "saved successfully";

				}
			}
		}
		return "not Saved";
	}

	public void read() {
		for (MallsDto dto : this.mallsdto) {
			System.out.println("Read running successfully:" + dto);
		}
	}

	public void update(String mallsname, String newMallName) {
		for (int index = 0; index < this.mallsdto.length; index++) {
			if (mallsdto != null && mallsdto[index].getMallNames() != null
					&& mallsdto[index].getMallNames().equals(mallsname)) {
				mallsdto[index].setMallNames(newMallName);
				System.out.println(mallsdto[index]);

			}
		}

	}

}
