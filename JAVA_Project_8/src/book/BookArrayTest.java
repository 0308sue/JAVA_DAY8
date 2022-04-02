package book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookArrayTest {
	private ArrayList<Book> arr = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void shewMenu() {
		System.out.println("선택하세요 >>");
		System.out.println("1.입력 2.전체보기 3.찾기 4.종료");
		System.out.println("선택 :");
	}
	public void bookInsert() {
		System.out.println("책제목");
		String title = sc.nextLine();
		System.out.println("책저자");
		String writer = sc.nextLine();
		System.out.println("책가격");
		int price = sc.nextInt();
		arr.add(new Book(title,writer,price));
	}
	public void bookList() {
		for(Book b:arr) {
			System.out.println(b);
		}
	}
	public void bookSearch() {
		System.out.println("책 제목>>");
		String title = sc.nextLine();
		boolean flag = false;
		Iterator<Book> it = arr.iterator();
		while(it.hasNext()) {
			Book b = it.next();
			if(b.getTitle().equals(title)) {
				flag = true;
				System.out.println(b);
				break;
			}
		}
		if(flag == false) {
			System.out.println("찾는 책 없음");
		}
	}
	public static void main(String[] args) {
		BookArrayTest bat = new BookArrayTest();
		while(true) {
			BookArrayTest.shewMenu();
			int num = BookArrayTest.sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 : bat.bookInsert();break;
			case 2 : bat.bookList();break;
			case 3 : bat.bookSearch();break;
			case 4 :System.out.println("종료");
							System.exit(0);
			default : System.out.println("입력오류");
			
			}
		}

	}

}
