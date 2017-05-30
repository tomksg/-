import java.util.ArrayList;

//import java.util.Scanner;

public abstract class Account {
	
	double balance;
	//public int time;
	
	abstract double getWithdrawableAccount();
	
	abstract void passTime(int time);

	public void debit(double amount) throws Exception{
		balance -= amount;
	}
	public double getBalance(){
		return balance;
	}
	//abstract void debit()
	
	public static double sumForAccount(ArrayList<Account> list){
		double sum = 0;
		for(Account account : list){
			sum+=account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList(ArrayList<Account> list, int month){
		for(Account account : list){
			account.passTime(month);
		}
	}
	
}
	
	
	/*
	Scanner input = new Scanner(System.in);
	
	private double balance; //private ���� ����
	private int name;
	
	public Account(int nameing, double balance1){ //������
		name = nameing;
		balance = balance1;
	}

	public void credit(int name,double credit){//�ݾ� ����										//����Ŷ�� public void credit(double a) { } �� �����Ѱ��� �����ߴ�.
		//System.out.print("Account�� ���� �ݾ��� �Է��Ͻÿ�:");		
		//double credit = input.nextDouble();
		System.out.printf("adding $%.2f to account%d balance\n",credit,name);
		balance = balance + credit;
	}
	
	public void debit(int name,double debit){ //�ݾ� ����
		//System.out.print("Account�� �E �ݾ��� �Է��Ͻÿ�:");
		//double debit = input.nextDouble();
		System.out.printf("subtracting $%.2f from account%d balance\n",debit,name);
		if(balance>debit){
			balance = balance - debit;			
		}else{
			System.out.println("Debit amount exceeded account balance");
		}
	}
	
	public double getBalance(){ //�뷱���� ���
		return balance;
	}
	public void printBalance(){ //�뷱���� ���
		System.out.printf("account%d balance: $%.2f\n",name,balance);		
	}
	
	protected void setBalance(double balance){//�ܾ׼����޼ҵ�
		this.balance = balance;
	}

}
*/
