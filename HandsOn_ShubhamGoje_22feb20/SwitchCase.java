//Switch case example

import java.util.Scanner;

public class SwitchCase {

	 static void vowel(char v) {
		 
		 switch(v) {
		 case 'A' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'E' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'I' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'O' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'U' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'a' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'e' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'i' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'o' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 case 'u' :
			 System.out.println("Yehh! It's a vowel:)");
			 break;
		 default :
			 System.out.println("Sorry! It's not a vowel:(");
				 
		 }
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a alphabet to check whether it is vower or not:");
		char v = s.next().charAt(0);
		vowel(v);
		s.close();

	}

}
