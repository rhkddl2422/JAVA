package report;

public class Employee extends Person {
	
	
	
	private String dept;

	
	public Employee()
	{
		super();
	}
	
	public Employee (String name, int age, String dept)
	{
		super(name,age);
		this.dept =dept;
	}
	
	@Override
	public void print()
	{
		super.print();
		System.out.printf("ºÎ¼­:%s%n",dept);
	}
	
	

}
