package day08;

public abstract class Animal  {
	protected String kind = "������ ����" ;
     public Animal() {}
     
     
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	public abstract void breath();
}