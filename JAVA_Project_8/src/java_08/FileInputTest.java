package java_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			 fr = new FileReader("/Users/songsumin/Library/Mobile Documents/com~apple~CloudDocs/day08-2/book/Book.java");
			 fw = new FileWriter("book_java.txt");
			int i;
			while((i = fr.read())!=-1) {
				System.out.print((char)i);
				fw.write(i);
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
    			e.printStackTrace();
			}
		}

	}

}

