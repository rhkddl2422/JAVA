package day10;

public class Test01 {

	public static void main(String[] args) {
		Employee<String> emp1 = new Employee("홍길동","20131001");
		System.out.println(emp1.number.charAt(3));
		
		
        Employee<Integer> emp2 = new Employee("고길동",20132002);
        System.out.println(emp2.number.);
        
        
        Employee emp3 = new Employee("홍길동",2019003); //type에 대해 언급하지않으면 오브젝트...
         System.out.println(emp3.name.); 
        
        
        
	}

}


class Employee<T>
{ 
	String name; //이름
	T number; //사번,int타입으로 할지 string타입으로 할지 결정을 못내렸다.
	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}
	
	
	
	
}