//Program to print fibonacci series till a given number

import java.util.Scanner;

public class Fibonacci {

	static void fibo(int num) {
		
		int n1 = 0;
		int n2 = 1;
		int t;
		System.out.print(n1+" "+n2+" ");	
		for(int i=1;i<num;i++) {
			System.out.print(n1+n2+" ");
			t = n1+n2;
			n1 = n2;
			n2 = t;
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n = s.nextInt();
		fibo(n);
		s.close();

	}

}
