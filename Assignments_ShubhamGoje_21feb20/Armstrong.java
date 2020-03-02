//Program to print Armstrong numbers in given range

import java.util.Scanner;

public class Armstrong{
	
	static void armPrint(int start,int end) {
		
		int num, i, rem, temp, counter=0;
		for(i=start+1; i<end; i++){
			   temp = i;
			   num = 0;
			   while(temp != 0){
				rem = temp%10;
				num = num + rem*rem*rem;
				temp = temp/10;
			   }
			   if(i == num){
				if(counter == 0)
				   System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
				System.out.print(i + "  ");
				   counter++;
			   }
			}
			if(counter == 0)
			   System.out.print("There is no Armstrong number Between "+start+" and "+end);
	}
    public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the start number: ");
		int start = s.nextInt();
		System.out.print("Enter the end number: ");
		int end = s.nextInt();
		armPrint(start,end);
		s.close();

	
    }
}