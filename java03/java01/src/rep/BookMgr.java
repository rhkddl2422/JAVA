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
	
	
	
		
		//���
		String keyword =JOptionPane.showInputDialog("title");
	    Iterator<Book> it =bookList.iterator();//set���ִ°� �б�
		while(it.hasNext())
		{
			Book book =(Book) it.next();
			
			if(book.title.toUpperCase().contains(keyword.toUpperCase())) {
			System.out.println(book);
			//contains�� �������ڸ� ��ã�´�.
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
			System.out.println("�����ұ��? y�� �Է��ϸ� �����˴ϴ�.");
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
		
		//����
		System.out.println("������ �������� �Է��ϼ���");
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


		
	
	
	
		
	
	

