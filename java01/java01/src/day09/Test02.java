package day09;

public class Test02 {
	public static void main(String[] args) {
		A a = new A("��浿");
		a.print();
		A.B b1 = a.new B();
		b1.print();
		

		A.B b = new A().new B();
		b.print();
	}
}

class A{
	String name = "ȫ�浿";
    
	public A() {}
	public A(String name) {
		this.name = name;
	}
	void print() {
		System.out.println(name.charAt(0)+"**");
	}
	class B{
		void print() {
			System.out.println(name);
		}
	}
	
}




