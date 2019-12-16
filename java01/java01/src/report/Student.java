package report;

public class Student extends Person {
	
	
	
	private int id;

	
	

	public Student()
	{
		super();
		
	}
	
	public Student(String name,int age,int id)
	{    
		 super(name,age);

		 this.id=id;
		
	}
	
	@Override
	public void print()
	{   
		super.print();
		System.out.printf("ÇĞ¹ø:%d%n",this.id);
	}
	

}
