
public class SavingAccount extends Account implements Valuable {

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
//		if(timeGone<5){
			sum = sum * Math.pow((1+interest),time);
			timeGone += time;
			balance = sum;
//		}else{
//			balance = sum; 
//			timeGone += time;
//		}
	}
	
	@Override
	public double EstimateValue(int month) {
		passTime(month);
		return balance;
	}
	@Override
	public String toString(){
		return String.format("SavingAccount_Balance: %s",getBalance());
	}

	
	//============================
	
	public void debit(double debit){
		if(timeGone>=12){
			balance = balance - debit;
		}else{
			System.out.println("���� ����� �� �����ϴ�.");
		}
	}
	public double getBalance(){ //�뷱���� ���
		return balance;
	}

}
