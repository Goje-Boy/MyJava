//Program to calculate permutation and combination

import java.util.Scanner;

public class PermutationCombination {

	static int fact(int n) {
	      int f = 1;
	      int i = 1;
	      while(i <= n) {
	         f *= i;
	         i++;
	      }
	      return f;
	}

	public static void main(String[] args) {
		
		int n = 0;
		int r = 0;
		int c, p;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n:");
		n = s.nextInt();
		System.out.print("Enter r:");
		r = s.nextInt();
		p = fact(n) / fact(n-r);
		System.out.println("Permutation: " + p);
		c = fact(n) / (fact(r) * fact(n-r));
		System.out.println("Combination: " + c);
		s.close();

	}

}
