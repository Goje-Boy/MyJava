//Program for Ternary operator example

import java.util.Scanner;

public class Ternary {

	static void lar(int x, int y) {
		
		int large;	
		large = (x>y)?x:y;
		System.out.println("Largest number is: "+large);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
int x = s.nextInt();
System.out.println("Enter second number");
int y = s.nextInt();
lar(x,y);
s.close();

	}

}
