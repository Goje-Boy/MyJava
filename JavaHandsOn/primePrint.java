//Program to print prime number till a given range

import java.util.Scanner;

public class primePrint {
	int num;
	
	void printPrime(int number) {
		this.num=number;
		int flag;
		
		for(int x=2;x<=this.num;x++) {
			flag=0;
			for(int i=1;i<=x;i++) {
				if(x%i==0)
					flag++;
				}
			if(flag==2)
				System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		primePrint n1 = new primePrint();
		System.out.println("Enter an number:");
		Scanner s = new Scanner(System.in);
		int ent = s.nextInt();
		n1.printPrime(ent);	
		s.close();
	}
}
