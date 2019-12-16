package day10;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import java.util.Iterator;
import java.util.Scanner;

public class Test06 {

	

	public static void main(String[] args) {
		
		Set<Book> bookList =new HashSet<Book>();
		
	//등록
		if(bookList.add(new Book("java",500)))
		{
			System.out.println("이미등록된 데이터가 있습니다.");
		}
		
		bookList.add(new Book("java",500));
		bookList.add(new Book("sql",1500));
		bookList.add(new Book("jsp",5500));
		bookList.add(new Book("java",500));
		bookList.add(new Book("hadoop",4500));
	
		//출력
		String keyword =JOptionPane.showInputDialog("title");
	    Iterator<Book> it =bookList.iterator();//set에있는거 읽기
		while(it.hasNext())
		{
			Book book =(Book) it.next();
			
			if(book.title.toUpperCase().contains(keyword.toUpperCase())) {
			System.out.println(book);
			//contains는 같은글자를 다찾는다.
			}
			
			
			
		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 도서명을 입력하세요");
		String msg = scanner.nextLine().trim();
		
		
		
	//검색
		while(it.hasNext()) {
			Book book=(Book)it.next();
			if(book.title.toUpperCase().contains(msg)) 
					{
				System.out.println(book);
				System.out.println("삭제할까요? y를 입력하면 삭제됩니다.");
			    msg = scanner.nextLine().trim();
			    if(msg.equalsIgnoreCase("y"))
				it.remove();
				}
	
		}
		
		//수정
		System.out.println("수정할 도서명을 입력하세요");
		msg =scanner.nextLine().trim();
		it = bookList.iterator();

		while(it.hasNext())
		{
			Book book =(Book) it.next();
			if(book.title.contains(msg)) {
			book.title=book.title+"___________";}
			
		}
		//출력
		it =bookList.iterator();//set에있는거 읽기
		while(it.hasNext())
		{
			Book book =(Book)it.next();
			System.out.println(book);
			

	}
		
			scanner.close();
			scanner=null;
			
	
	

		
		
	}
	
	
	
}
class Book
{
	String title;
	int price;
	public Book(String title, int price)
	{
		super();
		this.title =title;
		this.price =price;
		
		
	}
	public Iterator<Book> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object toUpperCase() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
	
}