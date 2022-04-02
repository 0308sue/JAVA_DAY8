package java_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class LineFile {
	//com.day08.book.Book.java 파일을 읽어서
	//output.txt 로 내보는데
	
	// 1 :  package com.day08.book;
	//BufferedReader ,PrintStream사용
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintStream ps = null;
		try {
			 br  = new BufferedReader(new FileReader("/Users/songsumin/Library/Mobile Documents/com~apple~CloudDocs/day08-2/book/Book.java"));
			 ps = new PrintStream(new File("output1.txt"));
			int cnt = 1;
			String str ; 
			while((str = br.readLine())!=null) {
				ps.println(cnt++ + ":    " + str);
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}finally {
			try {
				br.close();
				ps.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
