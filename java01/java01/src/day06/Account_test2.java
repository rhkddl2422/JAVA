package day06;

public class Account_test2 {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setNumber("2019-12-09-001");
		a1.setName("ȫ�浿");
		a1.setMoney(10);
		a1.print();
		
		Account a2 = new Account();
		a2.setNumber("2019-12-09-008");
		a2.setName("��浿");
		a2.setMoney(7000);
		a2.print();
		
		//a1.input(a2.output(2000));
		Account.transfer(a2, a1, 2000);
		
		a1.print();
		a2.print();
		
	}
}

