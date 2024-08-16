package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {

	public void createFile() {

		System.out.println("enter txt file name to create.. ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
		File file = new File(fileName.concat(".txt"));
		try {
			if (file.createNewFile()) {
				System.out.println(fileName + " file created ");
			} else {
				System.out.println("file can not create...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void createFolder() {
		System.out.println("enter folder name to create.. ");
		Scanner sc = new Scanner(System.in);
		String folderName = sc.next();
		//File file = new File(folderName);
		File file = new File("src/"+folderName);
		if(file.mkdir()) {
			System.out.println(folderName+"  created..");
		}
		else {
			System.out.println("Folder Can not create...");
		}
	 		
	}
	//idDirectory == isFile :- hw
	public void checkExist() {
		
		
		System.out.println("enter folder name to create.. ");
		Scanner sc = new Scanner(System.in);
		String folderName = sc.next();
		//File file = new File(folderName);
		File file = new File(folderName);
		if(file.exists()) {
			if(file.isDirectory()) {
				System.out.println("folder is available...");
			}else {
				System.out.println("folder is not available...");
			}
		}
		else {
			System.out.println("folder is not available...");
		}
	}
	
	public void checkFileList() {
		
		
		File file = new File("src\\com");
		File files [] = file.listFiles();
		for(File f:files) {
			System.out.println(f);
		}
		
		
	}
	
	public void getAbsPath(String fileName) {
		
		File file = new File(fileName);
		System.out.println(file.getAbsolutePath());
		
	}
	
	

	public static void main(String[] args) {

		FileDemo1 f1 = new FileDemo1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for create file....");
		System.out.println("Press 2 for create folder....");
		System.out.println("Press 3 for check folder.....");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			f1.createFile();
			break;
		case 2:
			f1.createFolder();
			break;
		case 3:
			f1.checkExist();
			break;
		case 4:
			f1.checkFileList();
			break;
			
		case 5:
			f1.getAbsPath("src");
			break;
			
			

		default:
			break;
		}

	}
}
