package book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookMapTest {
	Map<String,Book> map = new HashMap<String,Book>();
	public void bookInsert() {
		System.out.println("책제목");
		String title = BookArrayTest.sc.nextLine();
		System.out.println("책저자");
		String writer = BookArrayTest.sc.nextLine();
		System.out.println("책가격");
		int price = BookArrayTest.sc.nextInt();
		map.put(title,new Book(title,writer,price));
	}
	public void bookList() {
		for(Book b:map.values()) {
			System.out.println(b);
		}
		System.out.println("=========");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Book book = map.get(key);
			System.out.println("제목 :"+book.getTitle());
			System.out.println("저자 :"+book.getWriter());
			System.out.println();
		}
	}
	public void bookSearch() {
		System.out.println("책 제목>>");
		String title =  BookArrayTest.sc.nextLine();
			if(map.containsKey(title)) {
				System.out.println(map.get(title));
				return;
		}
			System.out.println("찾는 책 없음");
	}
	public static void main(String[] args) {
		BookMapTest bmt = new BookMapTest();
		while(true) {
			BookArrayTest.shewMenu();
			int num = BookArrayTest.sc.nextInt();
			BookArrayTest.sc.nextLine();
			switch(num) {
			case 1 : bmt.bookInsert();break;
			case 2 : bmt.bookList();break;
			case 3 : bmt.bookSearch();break;
			case 4 :System.out.println("종료");
							System.exit(0);
			default : System.out.println("입력오류");
			
			}
		}

	}

}
