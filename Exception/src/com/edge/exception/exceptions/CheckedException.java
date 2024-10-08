package com.edge.exception.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException extends Throwable {

	public static void readFile(String fileName) throws IOException {
		FileReader file=new FileReader(fileName);
		BufferedReader fileIn=new BufferedReader(file);
	}
	
}
