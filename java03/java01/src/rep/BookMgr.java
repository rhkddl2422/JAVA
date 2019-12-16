package rep;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;







public class BookMgr {
	
	Set<Book> bookList =new HashSet<Book>();
	
	
	
	
	
public void addBook(Book book){
		
		
		
		
		bookList.add(book);
		
		
		
}
public void printBookList(){
	
	
	
		
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
		
		
		
}

public void delete()
{
	Iterator<Book> it = bookList.iterator();
	 Scanner scanner = new Scanner(System.in);
	 String msg = scanner.nextLine().trim();
	while(it.hasNext()) {
		
		Book book=(Book)it.next();
		if(book.title.toUpperCase().contains(msg)) 
				{
			System.out.println(book);
			System.out.println("삭제할까요? y를 입력하면 삭제됩니다.");
		    msg = scanner.nextLine().trim();
		    if(msg.equalsIgnoreCase("y"))
			it.remove();
		    System.out.println(book);
			}
	
	
	
	
	
	
}
}
		
		




public void reform(){
	
	  Iterator<Book> it = bookList.iterator();
	  Scanner scanner = new Scanner(System.in);
		
		String msg = scanner.nextLine().trim();
		
		//수정
		System.out.println("수정할 도서명을 입력하세요");
		msg =scanner.nextLine().trim();
		it = bookList.iterator();

		while(it.hasNext())
		{
			Book book =(Book) it.next();
			if(book.title.contains(msg)) {
			book.title=book.title+"___________";}
			System.out.println(book);
		}
		
}


public int sumprice(){
	
	int sum=0;
	Iterator<Book> it = bookList.iterator();
	while(it.hasNext())
	{
		Book book =(Book) it.next();
		sum+=book.getPrice();
		
	}
	
	return sum;
	
	
	
	
}}


		
	
	
	
		
	
	


