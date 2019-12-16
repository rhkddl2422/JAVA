package day10;

public class Test01 {

	public static void main(String[] args) {
		Employee<String> emp1 = new Employee("ȫ�浿","20131001");
		System.out.println(emp1.number.charAt(3));
		
		
        Employee<Integer> emp2 = new Employee("���浿",20132002);
        System.out.println(emp2.number.);
        
        
        Employee emp3 = new Employee("ȫ�浿",2019003); //type�� ���� ������������� ������Ʈ...
         System.out.println(emp3.name.); 
        
        
        
	}

}


class Employee<T>
{ 
	String name; //�̸�
	T number; //���,intŸ������ ���� stringŸ������ ���� ������ �����ȴ�.
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