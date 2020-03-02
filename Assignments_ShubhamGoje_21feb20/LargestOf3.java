//Program to find largest of 3 numbers

import java.util.Scanner;

public class LargestOf3 {
	
	static void large(int x,int y,int z) {
		
		if(x > y && x > z)
            System.out.println("Largest number is:"+x);
        else if(y > z)
            System.out.println("Largest number is:"+y);
        else
            System.out.println("Largest number is:"+z);
	}
    public static void main(String[] args) {
    	
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        large(x,y,z);
        s.close();
 
    }
}