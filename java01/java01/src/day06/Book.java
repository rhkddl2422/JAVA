package day06;

public class Book {
	
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
	private String title;
	private int price;
	
	public Book(String name, int price){
		setTitle(name);
		setPrice(price);
		
	}
	
	
	

}
