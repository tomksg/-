import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AccountTest {
	public static void main(String args[]) throws Exception{
		Account account1 = new CheckingAccount(100,50,0.01,0.07); // bal lim interest lawn
		Account account2 = new SavingAccount(100,0.05); //bal , interest
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(account1);
		accountList.add(account2);

		System.out.println("전체 계좌의 잔액 합산 :"+Account.sumForAccount(accountList));
		System.out.println("전체 계좌의 12개월 후 적용");
		Account.passTimeForList(accountList, 12);
		System.out.println("전체 계좌의 잔액 합산 : "+Account.sumForAccount(accountList));
		/*
		//CheckinAccount
		Scanner scan = new Scanner(System.in);
		double amount;
		
		
		try{
			System.out.println("Enter deposit amount for Account1: ");
			amount = scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
		
			System.out.println("Enter deposit amount for Account2: ");
			amount=scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
		}catch(InputMismatchException e){
			System.out.println("예외발생 : 숫자를 입력하세요\n"+e.toString());
		}catch(Exception e){
			System.out.println("예외발샏 :  "+ e.toString());
		}finally{
			account1.passTime(2);
			System.out.println("2 month later account1 : "+ account1.getBalance());
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.printf("Account1 balance: $ %.2f\t현재출금가능액: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1:");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f\t현재출금가능액: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){ //false 면 0 true 면 1
			System.out.println("account1 went Bankrupt!");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f\t현재출금가능액: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){ //false 면 0 true 면 1
			System.out.println("account1 went Bankrupt!");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f\t현재출금가능액: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()){ //false 면 0 true 면 1
			System.out.println("account1 went Bankrupt!");
		}
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $%.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
		*/
	}
}
