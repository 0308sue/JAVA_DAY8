package java_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class LineFile2 {
	//com.day08.book.Book.java 파일을 읽어서
	//output2.txt 로 내보는데
	
	// 1 :  package com.day08.book;
	//Scanner ,PrintStream사용
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream ps =null;
       try {
		 sc = new Scanner(new File("/Users/songsumin/Library/Mobile Documents/com~apple~CloudDocs/day08-2/book/Book.java"));
		 ps = new PrintStream(new File("output2.txt"));
		 int cnt =1;
		 while(sc.hasNext()) {
			 ps.println(cnt++ +" :  " + sc.nextLine());
		 }
       } catch (FileNotFoundException e) {
				e.printStackTrace();
       }finally {
    	   sc.close();
    	   ps.close();
       }
		
	}

}



