import java.util.Scanner;
public class AccountTest {
	public static void main(String args[]){
		Account account1 = new CheckingAccount(100,50,0.01,0.07); // bal lim interest lawn
		Account account2 = new SavingAccount(100,0.05); //bal , interest
		
		//CheckinAccount
		Scanner scan = new Scanner(System.in);
		double amount;
		
		System.out.printf("Account1 balance: $ %.2f\t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1:");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f\t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){ //false �� 0 true �� 1
			System.out.println("account1 went Bankrupt!");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f\t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){ //false �� 0 true �� 1
			System.out.println("account1 went Bankrupt!");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f\t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){ //false �� 0 true �� 1
			System.out.println("account1 went Bankrupt!");
		}
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $%.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $%.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $%.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		
	}
}
