package day10;

public class Text02 {

	

	public static void main(String[] args) {
//		Employee2<String,String>emp1=  new Employee2("ȫ�浿","20131001");
//				System.out.println(emp1);
//				
				
				
				
				Employee2<String,Integer>emp2 =
						new Employee2<String,Integer>("ȫ�浿",20131001);
				System.out.printf(emp2,number/1000);
				Employee2<String,Integer>emp3 =
						new Employee2<String,Double>("ȫ�浿",20131001.0);
				System.out.printf(emp3);
		
		
		
		
	}

}

class Employee2<T,P extends Number>
{
    T name;      //�ٿ��ɽ��� �����Ѵ�.
	P number;    //�ٿ��ɽ��� �����Ѵ�. P�� Number�� 
	
	public Employee2(T name, P number)
	{
		super();
		this.name = name;
		this.number = number;
		
		
		
	}
	
	
	
}


