import java.util.Scanner;

public class AccountTest {

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int name1 = 1;
		int name2 = 2;
		CheckingAccount Account1 = new CheckingAccount(1,100.0);
		CheckingAccount Account2 = new CheckingAccount(2,100.0);
		
		Account1.printBalance();
		Account2.printBalance();
		System.out.print("Account1에 더할 금액을 입력하시오:");	
		double bal2 = input.nextDouble();
		Account1.credit(name1,bal2);
		
		
		Account1.printBalance();
		Account2.printBalance();
		
		System.out.print("Account2에 뺼 금액을 입력하시오:");	
		double bal3 = input.nextDouble();
		Account2.debit(name2,bal3);
		
		Account1.printBalance();
		Account2.printBalance();

		System.out.print("next month!\n");
		Account1.nextMonth();
		Account2.nextMonth();
		
		Account1.printBalance();
		Account2.printBalance();
	}
}
