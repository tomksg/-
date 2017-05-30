
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
		if(timeGone<=12){
			sum = sum * Math.pow((1+interest),time);
			timeGone += time;	
			balance = sum; // ������ �ڵ帣 �����ؾ������� �ϴ� �̷��� ������.
		}else{
			balance = sum; 
			timeGone += time;
		}
	}
	
	
	//============================
	
	public void debit(double amount) throws Exception{
		
		
		
		if(timeGone>=12){
			balance = balance - amount;
		}else{
			throw new Exception("���� ����� �� �����ϴ�");
		}
	}
	public double getBalance(){ //�뷱���� ���
		return balance;
	}
}
