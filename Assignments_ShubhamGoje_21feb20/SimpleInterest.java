//Program to Calculate Simple Interest

import java.util.Scanner;

public class SimpleInterest{
	
	static void simpInt(float p,float r,float n) {
		
		  	float si;
	        si = (p * r * n) / 100;
	        System.out.print("The Simple Interest is : " + si);
	}
	
    public static void main(String args[]) {
    	
        float p, r, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of Interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Number of years : ");
        n = s.nextFloat();
        simpInt(p,r,n);
        s.close();

    }
}