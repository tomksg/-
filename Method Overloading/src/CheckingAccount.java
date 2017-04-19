
public class CheckingAccount extends Account implements Valuable {
	
	private double balance;
	private double limit;
	private double interest;
	private double loaninterest;
	
	public CheckingAccount(double balance,double limit,double interest,double loaninterest){
		this.balance = balance;
		this.limit = limit;
		this.interest = interest;
		this.loaninterest = loaninterest;
	}
	
	@Override
	double getWithdrawableAccount() {
		if(balance + limit > 0){
			return balance + limit;
		}else{
			return 0;
		}
	}

	public boolean isBankrupted(){
		if(balance + limit > 0){
			return false;
		}else{
			return true;
		}
	}
	
	@Override //Overriding by Account and Valuable
	public void passTime(int time) {
		if(balance>0){
			double sum = balance + time * interest * balance;
			balance = sum;
		}else{
			double sum = balance + time * loaninterest * balance;
			balance = sum;
		}
	}

	public void passTime(){
		if(balance>0){
			double sum = balance + 1 * interest * balance;
			balance = sum;
		}else{
			double sum = balance + 1 * loaninterest * balance;
			balance = sum;
		}
	}

	@Override
	public double EstimateValue(int month) {
		passTime(month);
		return getBalance();
	}
	public double EstimateValue(){
		passTime(1);
		return getBalance();
		
	}
	
	@Override
	public String toString(){
		return String.format("CheckingAccount_Balance: %s",balance);
	}

	
	//=========================================== 원래 존재하는 함수
	
	public double getBalance(){ //밸런스를 출력
		return balance;
	}
	public void debit(double debit){ //금액 감소
		if((balance+limit)>debit){
			balance = balance - debit;			
		}else{
			System.out.println("Debit amount exceeded account balance");
			balance = balance - debit;
		}
	}
	public void credit(double credit){
		balance=balance+credit;
	}
}
