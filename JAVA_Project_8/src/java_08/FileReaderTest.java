package java_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			 fis = new FileInputStream("/Users/songsumin/Library/Mobile Documents/com~apple~CloudDocs/day08-2/book/Book.java");
			 fos = new FileOutputStream("book_java.txt");
			int i;
			while((i = fis.read())!=-1) {
				System.out.print((char)i);
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
    			e.printStackTrace();
			}
		}

	}

}

