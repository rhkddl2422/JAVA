package day08;

public class Dog extends Animal {
	String kind = "강아지 종류";
	String name;

	public String getSuperKind() {
		
		return super.kind; //부모클래스를 kind를 반환 
	}
	
	public Dog() {
		super("강아지");
	}
	public Dog(String kind, String name) {
		super("강아지");//kind를 생성자 함수가 해준다...
		this.kind = kind;
		this.name = name;
	}
	public void print() {
		System.out.printf("[%s, %s, %s]%n", 
				super.kind, this.kind, this.name);
	}
	
	@Override
	public void breath()
	{
		System.out.println("폐로 동작......");
		
	}
}
