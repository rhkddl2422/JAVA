package day10;

public class Text02 {

	

	public static void main(String[] args) {
//		Employee2<String,String>emp1=  new Employee2("홍길동","20131001");
//				System.out.println(emp1);
//				
				
				
				
				Employee2<String,Integer>emp2 =
						new Employee2<String,Integer>("홍길동",20131001);
				System.out.printf(emp2,number/1000);
				Employee2<String,Integer>emp3 =
						new Employee2<String,Double>("홍길동",20131001.0);
				System.out.printf(emp3);
		
		
		
		
	}

}

class Employee2<T,P extends Number>
{
    T name;      //다운케스팅 들어가야한다.
	P number;    //다운케스팅 들어가야한다. P는 Number의 
	
	public Employee2(T name, P number)
	{
		super();
		this.name = name;
		this.number = number;
		
		
		
	}
	
	
	
}


