
public abstract class Account {
	
	double balance;
	//public int time;
	
	abstract double getWithdrawableAccount();
	
	abstract void passTime(int time);
	public void passTime(){}

	public void debit(double debit){
		
	}
	public double getBalance(){
		return balance;
	}
	//abstract void debit()

	public void credit(double credit) {
		// TODO Auto-generated method stub
		
	}

	public double EstimateValue() {
		return balance;
		// TODO Auto-generated method stub

	}

	public double EstimateValue(int i) {
		// TODO Auto-generated method stub
		return balance;
	}
}