package java_08;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedTest {

	public static void main(String[] args) {

//		BufferedReader br 
//		= new BufferedReader(new InputStreamReader(System.in));
//	   try {
//		String str = 	br.readLine();
//		System.out.println(str);
//	} catch (IOException e) {
//			e.printStackTrace();
//	}finally {
//		try {
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
		
//		Scanner sc = new Scanner(System.in);
//		String line = sc.nextLine();
//		System.out.println(line);
		
		
		Scanner scanner;
		try {
			scanner = new Scanner(new File("book_java.txt"));
			System.out.println(scanner.nextLine());
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}
}

