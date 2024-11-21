package com.google.enquiry.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnquiryFile {

	public void writeFile(EnquiryDto dto) {

		File file = new File("Enquiry.txt");
		System.out.println("File:" + file);
		
		try {
			if (!file.exists()) {
				if (file.createNewFile()) {
					System.out.println("New File Created");
					addObject(dto, file);
				}
			}
		} catch (IOException e) {
			System.out.println("File is not created");
		}
	}

	private static Object readObject(File file) {
		try (FileInputStream filein = new FileInputStream(file); ObjectInputStream in = new ObjectInputStream(filein)) {
			System.out.println("Reading Object");
			return in.readObject();
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
			return new Object();
		}
	}

	private void addObject(EnquiryDto dto, File file) {
		try (FileOutputStream out = new FileOutputStream(file); ObjectOutputStream in = new ObjectOutputStream(out)) {
			System.out.println("Saving Object");
			in.writeObject(dto);
			System.out.println("File Length:" + file.length());
		} catch (IOException e) {
			System.out.println("File is not present");
		}

	}

}
