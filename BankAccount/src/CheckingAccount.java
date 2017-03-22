
public class CheckingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;

	public CheckingAccount(int nameing, double balance1) {
		super(nameing, balance1);
		credit_limit = 100;
		interest = 0.1;
		loan_interest = 0.07;
	}

	
	public void debit(int name,double debit){
		//System.out.print("Account에 뺼 금액을 입력하시오:");
		//double debit = input.nextDouble();
		//System.out.printf("subtracting $%.2f from account%d balance\n",debit,name);
		double bal1 = getBalance(); 
		if(bal1>debit){
			bal1 = bal1 - debit;			
		}else if(debit-bal1<credit_limit){
			bal1 = bal1 - debit;
			System.out.println("Debit amount exceeded account balance");
		}else{
			System.out.println("Debit amount exceeded account credit_limit");
		}
		setBalance(bal1);
	}
	
	public void nextMonth(){
		double bal1 = getBalance(); 
		if(bal1>0){
			bal1 = bal1 * (1 + interest);
		}else{
			bal1 = bal1 * (1 + loan_interest);
		}
		setBalance(bal1);
	}
}
