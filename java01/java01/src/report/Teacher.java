package report;

public class Teacher extends Person {
	
	
	
	private String subject;

	
	
	public Teacher() {
		super();
	

}
	public Teacher(String name,int age,String subject)
	{
		super(name,age);
		this.subject=subject;
	}

	@Override
	public void print()
	{
		super.print();
		System.out.printf("����:%s%n", subject);
     
	}
	
	

}
