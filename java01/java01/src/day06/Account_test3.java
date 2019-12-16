package day06;

import javax.swing.JOptionPane;

public class Account_test3 {

	public static void main(String[] args) {
		Account []  accounts =
				{new Account("2019-12-09-001","È«±æµ¿",10),
					new Account("2019-12-09-001","È«±æµ¿",10),
					new Account("2019-12-09-001","È«±æµ¿",10),
					new Account("2019-12-09-001","È«±æµ¿",10),
					new Account("2019-12-09-001","È«±æµ¿",10),
					new Account("2019-12-09-001","È«±æµ¿",10)
		
		
				};
		System.out.println("Account list");
		
		for(int i=0;i<accounts.length;i++)
			{accounts[i].print();}
		System.out.println("Account °Ë»ö");
		String name = JOptionPane.showInputDialog("°Ë»öÇÒ ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä");
 	    for (int i=0;i<accounts.length;i++)
 	    {
 	    	if(name.trim().equalsIgnoreCase(accounts[i].getName()))
 	    	accounts[i].print();
 	    	
 	    }
 	    }
	}
}
