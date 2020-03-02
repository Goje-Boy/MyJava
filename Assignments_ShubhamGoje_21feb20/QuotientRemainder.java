//Program to calculate quotient and remainder 

import java.util.Scanner;

public class QuotientRemainder {
	
	void calc(int n1, int n2) {
		
		int quotient = n1 / n2;
	    	int remainder = n1 % n2;
	   	System.out.println("Quotient is:"+quotient);
	    	System.out.println("Remainder is:"+remainder);
	}
	
   public static void main(String args[]){
	   
		QuotientRemainder obj = new QuotientRemainder();
      	Scanner s = new Scanner(System.in);
      	System.out.print("Enter First number:");
      	int n1 = s.nextInt();
      	System.out.print("Enter Second number:");
      	int n2 = s.nextInt();
      	obj.calc(n1, n2);
      	s.close();
      
   }
}