package day09;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		Controller cmd = null;
		
		Controller insert =  new Controller(){
			@Override
			public void exec() {
				System.out.println("insert ����");
			}
		};
		
		Controller update = new Controller() {
			@Override
			public void exec() {
				System.out.println("update ����");
			}
		};

		Controller delete = new Controller() {
			@Override
			public void exec() {
				System.out.println("delete ����");
			}
		};		
				
		String msg = 
   JOptionPane.showInputDialog("����� �Է��ϼ���. 1.delete 2.insert 3.update");
       
       switch (msg) {
			case "1":
			case "delete":
				cmd = delete;
				break;
			case "2":
			case "insert":
				cmd = insert;
				break;
			case "3":
			case "update":
				cmd = update;
				break;
			default:
				System.out.println("��� ������ �ٽ��ϼ���");
				break;
	   }
       
       if(cmd != null) cmd.exec();

				
	}
}

interface Controller{
	void exec();
}

class DeleteController implements Controller{
	@Override
	public void exec() {
		System.out.println("DeleteController ����");
	}
}
