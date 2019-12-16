package day09;

public class Test09 {
	public static void main(String[] args)
	{
		
	  Account account =new Account ("홍길동 ","001",1000);
	  try {
		  account.output(7000);
	  } catch(Exception a) {

	  System.out.println(a.getMessage());
			  

}
}

	
	class MoneyException extends Exception{
		
		MoneyException()
		{
			super("계좌잔고 예외 발생 ");
		}
		
		MoneyException(String msg){
		super(msg);
		}
		
	}


class Account{
	
	String name;
	String number;
	int money;
	
	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}

	public void input(int money)
	{
		this.money += money;
		
	}
	
	public void output (int money) throws MoneyException {
		//throws 메소들 던지는거고 
		
		if(this.money < money) throw new MoneyException();
{
		this.money -=money;
		
	}
	}
	
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", money=" + money + "]";
	}
	
	

	
	
	
}}
