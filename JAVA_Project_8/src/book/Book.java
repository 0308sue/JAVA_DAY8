package book;

public class Book {
	private String title;
	private String writer;
	private int price;
	public Book(String title,String writer,int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [책제목 ="+title+",책저자 ="+writer+",책가격 ="+price+"]";
	}
	

}
