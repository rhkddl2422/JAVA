package day06;

public class Book_web {

	public static void main(String[] args) {
		
		BookMgr bmr=new BookMgr();
		Book []  book= {new Book("�̳�;߼�",9500),
				new Book("�˿͹�",10000),new Book("�ɸ��������",25000)};
        for(int i=0;i<book.length;i++)
		{       bmr.addBook(book[i]);
		        bmr. printBookList(book[i]);
		        bmr.printTotalPrice(book[i].getPrice());		
		}
		
       
        
	}

}
