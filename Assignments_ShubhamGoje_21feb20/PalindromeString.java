//Program to check whether a string is palindrome or not

import java.util.Scanner;

public class PalindromeString {

	static void checkString(String a) {
		
		String temp = "";
		for(int i=a.length()-1;i>=0;i--)
			temp = temp + a.charAt(i);
		if(a.equals(temp))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");	
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.nextLine();
		checkString(str);
		s.close();
	}

}
