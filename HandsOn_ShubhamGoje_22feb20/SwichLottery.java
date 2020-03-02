//Program to implement switch case

import java.util.Scanner;

public class SwichLottery {

	static void lottery(int id) {
		
		switch(id) {
		case 1 : System.out.println("Yehh! You Won a TV."); break;
		case 2 : System.out.println("Yehh! You Won a Laptop."); break;
		case 3 : System.out.println("Yehh! You Won a Fridge."); break;
		case 4 : System.out.println("Yehh! You Won a Microwave."); break;
		case 5 : System.out.println("Yehh! You Won a AC."); break;
		case 6 : System.out.println("Yehh! You Won a Induction Stove"); break;
		case 7 : System.out.println("Yehh! You Won a Home Theater"); break;
		default : System.out.println("Better luck next time");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your lottery id:");
		int id = s.nextInt();
		lottery(id);
		s.close();

	}

}
