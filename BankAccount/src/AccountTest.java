
public class AccountTest {

	public static void main(String[]args){
		Account Account1 = new Account(1,50.0);
		Account Account2 = new Account(2,0);
		Account1.getBalance();
		Account2.getBalance();
		
		Account1.debit();
		Account1.getBalance();
		Account2.getBalance();
		
		Account2.debit();
		Account1.getBalance();
		Account2.getBalance();
		
	}
}
