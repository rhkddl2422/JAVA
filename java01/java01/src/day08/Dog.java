package day08;

public class Dog extends Animal {
	String kind = "������ ����";
	String name;

	public String getSuperKind() {
		
		return super.kind; //�θ�Ŭ������ kind�� ��ȯ 
	}
	
	public Dog() {
		super("������");
	}
	public Dog(String kind, String name) {
		super("������");//kind�� ������ �Լ��� ���ش�...
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
		System.out.println("��� ����......");
		
	}
}
