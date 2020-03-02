//Program to check leap year

import java.util.Scanner;

public class LeapYear {
	
	void leap(int year) {
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("It is a leap year");
	      else
	         System.out.println("It is not a leap year");
	}

   public static void main(String[] args){
	   
      int year;
      LeapYear y = new LeapYear();
      System.out.print("Enter an Year : ");
      Scanner s = new Scanner(System.in);
      year = s.nextInt();
      y.leap(year);
      s.close();

   }

}