import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	
	private double balance; //private 으로 선언
	private int name;
	
	public Account(int nameing, double balance1){ //생성자
		name = nameing;
		balance = balance1;
	}
	
	public void credit(){//금액 증가
		System.out.print("Account에 더할 금액을 입력하시오:");		
		double credit = input.nextDouble();
		System.out.printf("adding $%.2f to account%d balance\n",credit,name);
		balance = balance + credit;
	}
	
	public void debit(){ //금액 감소
		System.out.print("Account에 뺼 금액을 입력하시오:");
		double debit = input.nextDouble();
		System.out.printf("subtracting $%.2f from account%d balance\n",debit,name);
		if(balance>debit){
			balance = balance - debit;			
		}else{
			System.out.println("Debit amount exceeded account balance");
		}
	}
	
	public void getBalance(){ //밸런스를 출력
		System.out.printf("account%d balance: $%.2f\n",name,balance);		
	}	
}
