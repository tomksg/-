import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int total = 0;
		String key;
		Scanner scan = new Scanner(System.in);
		Snakegame game = new Snakegame();
		// Game start menu
		while (true) {

			System.out.println("press any key to start");

			key = scan.nextLine();
			// if(window.event.keyCode==27) -> keylistener �� ����ؼ� ��������
			if (key.equals('x')) {
				break;
			}else{
				game.Initiategame();
			}
			
		}

	}
}
