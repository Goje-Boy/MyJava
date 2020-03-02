//Program to calculate interest on loan for the number of years entered by user using For loop.

import java.util.Scanner;

public class ForLoopEx {

	 static float interest(float p) {
		 float total=8;
		 for(int year=1;year<=p;year++)
			total = (float) (total*1.05);
		 return total;		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the period of loan:");
		float per = s.nextFloat();
		System.out.print("Intrest you have to pay for "+per+" years is:");
		System.out.printf("%.2f",interest(per));
		System.out.print("%");
		s.close();
		}

}
