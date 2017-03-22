import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	
	private double balance; //private ���� ����
	private int name;
	
	public Account(int nameing, double balance1){ //������
		name = nameing;
		balance = balance1;
	}
	
	public void credit(){//�ݾ� ����
		System.out.print("Account�� ���� �ݾ��� �Է��Ͻÿ�:");		
		double credit = input.nextDouble();
		System.out.printf("adding $%.2f to account%d balance\n",credit,name);
		balance = balance + credit;
	}
	
	public void debit(){ //�ݾ� ����
		System.out.print("Account�� �E �ݾ��� �Է��Ͻÿ�:");
		double debit = input.nextDouble();
		System.out.printf("subtracting $%.2f from account%d balance\n",debit,name);
		if(balance>debit){
			balance = balance - debit;			
		}else{
			System.out.println("Debit amount exceeded account balance");
		}
	}
	
	public void getBalance(){ //�뷱���� ���
		System.out.printf("account%d balance: $%.2f\n",name,balance);		
	}	
}
