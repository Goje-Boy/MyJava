//Program to calculate power

import java.util.Scanner;

public class Power{
	
	double calcPow(double n, double p) {
		
		double ans = 1;
		for(int i=1;i<=p;i++)
			ans = ans*n;
		return ans;
	}
	
	public static void main(String[] args) {
		
		Power obj = new Power();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		double n = s.nextDouble();
		System.out.println("Enter the power:");
		double p = s.nextDouble();
		double ans = obj.calcPow(n,p);
		System.out.println("Answer is:"+ans);
		s.close();	
	}
}