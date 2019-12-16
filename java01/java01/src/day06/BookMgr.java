package day06;

public class BookMgr {
	
	
	
	static int count=0;
	
	Book[] booklist= new Book[100];
	
	public void addBook(Book book)
	{
	
		  booklist[count]=book;
	       count++;
			
		
	}
	public void printBookList(Book booklist)
	{
	    System.out.printf("%s%n",booklist.getTitle());
		
		
	}
	
	public void printTotalPrice (int A)
	{   
		int total_price = 0;
		for(int j=0;j<booklist.length;j++)
		{
		
		 total_price+= A;
		
		
		
		}
		System.out.printf("총 도서가격은:%d%n",total_price);
	}
	
	
	
	
	

}
