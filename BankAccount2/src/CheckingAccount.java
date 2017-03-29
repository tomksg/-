
public class CheckingAccount extends Account {
	
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
	
	@Override
	void passTime(int time) {
		if(balance>0){
			double sum = balance + time * interest * balance;
			balance = sum;
		}else{
			double sum = balance + time * loaninterest * balance;
			balance = sum;
		}
	}
	//=========================================== ���� �����ϴ� �Լ�
	
	public double getBalance(){ //�뷱���� ���
		return balance;
	}
	public void debit(double debit){ //�ݾ� ����
		if((balance+limit)>debit){
			balance = balance - debit;			
		}else{
			System.out.println("Debit amount exceeded account balance");
			balance = balance - debit;
		}
	}
	
}
