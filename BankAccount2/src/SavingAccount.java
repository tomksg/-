
public class SavingAccount extends Account {

	private double balance;
	private double interest;
	private int timeGone;
	private double sum;
	
	public SavingAccount(double balance,double interest){
		this.balance = balance;
		this.interest = interest;
		timeGone = 0;
		sum = this.balance;
	}
	
	@Override
	double getWithdrawableAccount() {
		if(timeGone>=12){
			return balance;
		}else{
			return 0;
		}
	}

	@Override
	void passTime(int time) {
		if(timeGone<12){
			sum = sum * Math.pow((1+interest),time);
			timeGone += time;	
		}else{
			balance = sum; 
			timeGone += time;
		}
	}
	
	
	//============================
	
	public void debit(double debit){
		if(timeGone>=12){
			balance = balance - debit;
		}else{
			System.out.println("아직 출금할 수 없습니다.");
		}
	}
	public double getBalance(){ //밸런스를 출력
		return balance;
	}
}
