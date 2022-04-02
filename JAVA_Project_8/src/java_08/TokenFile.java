package java_08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TokenFile {
	//aa.txt 파일을 읽어서 : 구분하여 숫자만 
	// 숫자를 16진수로 변경시켜 bb.txt  내보내기
	 // Scanner  PrintStream  spilt() 메소드 사용	
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream ps = null;
		
		try {
			sc = new Scanner(new File("/Users/songsumin/Library/Mobile Documents/com~apple~CloudDocs/day08-2/book/Book.java"));
			ps = new PrintStream("/Users/songsumin/JAVA08/bb.txt");
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String[] tmp = line.split(":");
				for(int i=0; i<tmp.length;i++) {
					System.out.println(tmp[i]);
					String hex = Integer.toHexString(Integer.parseInt(tmp[i]));
					ps.print(hex.toUpperCase()+"  ");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
			ps.close();
		}
		

	}

}