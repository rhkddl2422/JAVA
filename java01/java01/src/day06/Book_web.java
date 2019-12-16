package day06;

public class Book_web {

	public static void main(String[] args) {
		
		BookMgr bmr=new BookMgr();
		Book []  book= {new Book("固赤客具荐",9500),
				new Book("了客国",10000),new Book("吧府滚咯青扁",25000)};
        for(int i=0;i<book.length;i++)
		{       bmr.addBook(book[i]);
		        bmr. printBookList(book[i]);
		        bmr.printTotalPrice(book[i].getPrice());		
		}
		
       
        
	}

}
