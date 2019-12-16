package day09;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
       Command cmd = null;
       
       String msg = 
   JOptionPane.showInputDialog("����� �Է��ϼ���. 1.delete 2.insert 3.update");
       
       switch (msg) {
			case "1":
			case "delete":
				cmd = new DeleteCommand();
				break;
			case "2":
			case "insert":
				cmd = new InsertCommand();
				break;
			case "3":
			case "update":
				cmd = new UpdateCommand();
				break;
			default:
				//System.out.println("��� ������ �ٽ��ϼ���");
				cmd = new  ListCommand();
				break;
	   }
       
       if(cmd != null) {
    	   cmd.exec();
    	   cmd.base();
       }
		
	}
}


interface Command{
	void exec();
	default public void base() {
		System.out.println("Command base() ��� ");
	}
}

class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("DeleteCommand ����");
	}
}

class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand ����");
	}
	public void base() {
		System.out.println("UpdateCommand base() ��� ������  ");
	}
}

class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("InsertCommand ����");
	}
}

class ListCommand implements Command{
	public void exec() {
		System.out.println("ListCommand ����");
	}
}




