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
	
	private double balance; //private 으로 선언
	private int name;
	
	public Account(int nameing, double balance1){ //생성자
		name = nameing;
		balance = balance1;
	}

	public void credit(int name,double credit){//금액 증가										//만들거라면 public void credit(double a) { } 로 만들어둘것을 깜빡했다.
		//System.out.print("Account에 더할 금액을 입력하시오:");		
		//double credit = input.nextDouble();
		System.out.printf("adding $%.2f to account%d balance\n",credit,name);
		balance = balance + credit;
	}
	
	public void debit(int name,double debit){ //금액 감소
		//System.out.print("Account에 뺼 금액을 입력하시오:");
		//double debit = input.nextDouble();
		System.out.printf("subtracting $%.2f from account%d balance\n",debit,name);
		if(balance>debit){
			balance = balance - debit;			
		}else{
			System.out.println("Debit amount exceeded account balance");
		}
	}
	
	public double getBalance(){ //밸런스를 출력
		return balance;
	}
	public void printBalance(){ //밸런스를 출력
		System.out.printf("account%d balance: $%.2f\n",name,balance);		
	}
	
	protected void setBalance(double balance){//잔액수정메소드
		this.balance = balance;
	}

}
*/
