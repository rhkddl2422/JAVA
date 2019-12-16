package rep;

public class Book {
	String title;
	private int price;
	private int isbn;
	
	public Book() {	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", isbn=" + isbn + "]";
	}


}
