package day06;

public class Account {
	private String name;
	private String number;
	private int money;
	
	public Account() {
		System.out.println("Account()  �⺻������  ���� ");
	}
	public Account(String number,String name,int money) {
		setNumber(number);
		setName(name);
		setMoney(money);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * 
	 * @param money �Աݱݾ�
	 */
	public void input(int money){
		this.money += money;
		return;
	}
	
	/**
	 * 
	 * @param money ��ݱݾ�
	 * @return ��ݾ�
	 */
	public int output(int money){
		if(this.money >= money) {
			this.money -= money;
			return money;
		}else {
			return 0;
		}
	}

	/**
	 * ���� ���� ��� 
	 */
	public void print(){
		System.out.printf("[%s(%s) �ܰ�:%d��]%n",number,name,money);
		return;
	}
	
	/**
	 * ������ü
	 * @param from
	 * @param to
	 * @param money
	 */
	public static void transfer(Account from , Account to,int money) {
		System.out.println("������ü");
		System.out.println(from.number+" -> "+to.number);
		to.input(from.output(money));
	}
}


