package com.edge.exception.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.edge.exception.exceptions.CheckedException;

public class CheckedExceptionRunner {

	public static void main(String[] args) throws IOException {
		CheckedException exception=new CheckedException();
		
		try {
			exception.readFile("No file existence");
		}catch(FileNotFoundException e) {
			System.out.println("Caught Exception"+ e.getMessage());
		}catch(IOException e) {
			System.out.println("Caught Exception"+ e.getMessage());
		}

	}

}
