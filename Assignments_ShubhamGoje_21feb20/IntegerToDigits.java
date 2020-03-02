//Program to print seperate digits form an integer

import java.util.Scanner;

public class IntegerToDigits{
	
	static void intToDig(int temp) {
		
		int  digit;
		System.out.print("Digits are: ");
        while(temp > 0)
        {
            digit = temp % 10;
            System.out.print(digit+" ");
            temp = temp / 10;
        }
	}
	
    public static void main(String args[])
    {
    	
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = s.nextInt();
        intToDig(num);
        s.close();
        
    }
}
