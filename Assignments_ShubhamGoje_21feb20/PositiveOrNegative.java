//Program to check if number is positive or negative

import java.util.Scanner;

public class PositiveOrNegative {
	
	static void positiveNegative(int num) {
		
		if (num > 0)
        System.out.println("Entered number is a positive.");
        else if(num < 0)
        System.out.println("Entered number is a negative.");
	}
   public static void main(String args[]){
	   
      int num;
      System.out.print("Enter a number : ");
      Scanner s = new Scanner(System.in);
      num = s.nextInt();
      positiveNegative(num);
      s.close();
   }
}