package com.file_example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_First_Demo {
	public static void main(String[] args) throws IOException {
		/*
		 * File file = new File("cricket.txt"); System.out.println(file.exists());
		 * file.createNewFile(); System.out.println(file.exists());
		 */
		FileWriter fileWriter=new FileWriter("cricket.txt",true);
		
	}
}
