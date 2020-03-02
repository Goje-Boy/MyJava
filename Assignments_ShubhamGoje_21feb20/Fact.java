//Program to calculate factorial of a number

import java.util.Scanner;

public class Fact {
	int number;
	
	int fact(int num) {	
	
		this.number = num;	
		if(num==0)
			return 1;
		else
			
			return num*fact(num-1);
			
		
	}
	
	public static void main(String[] args)  {
		
		Fact f = new Fact();
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Number to find Factorial:");
		int number = read.nextInt();
		int fac = f.fact(number);
		System.out.println("Factorial of "+number+" is "+fac);
		read.close();
		
	}

	

}
