package java_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenFile2 {
	//aa.txt 파일을 읽어서 : 구분하여 숫자만 
	// 숫자를 8진수로 변경시켜 cc.txt  내보내기
	 // BufferedReader  PrintStream  StringTokenizer 사용	
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintStream ps = null;
		
		try {
			br = new BufferedReader(new FileReader("/Users/songsumin/Library/Mobile Documents/com~apple~CloudDocs/day08-2/book/Book.java"));
			ps = new PrintStream("/Users/songsumin/JAVA08/cc.txt");
			String str;
			while((str =br.readLine())!=null) {
				StringTokenizer stk = new StringTokenizer(str,":");
				while(stk.hasMoreTokens()) {
					String oct = Integer.toOctalString(Integer.parseInt(stk.nextToken()));
					System.out.println(oct);
					ps.print(oct +"   "); //8진수로 내보내기
				}
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