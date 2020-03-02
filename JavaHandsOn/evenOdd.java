//Program to check if a number is even or odd

public class evenOdd {
	int number;

	public void checkEvenOdd(int num) {
		this.number = num;
		if(num%2==0)
			System.out.println(num+" is a Even Number");
		else
			System.out.println(num+" is a Odd Number");
		}

	public static void main(String[] args) {
		evenOdd n1 = new evenOdd();
		n1.checkEvenOdd(6);
	}
}
