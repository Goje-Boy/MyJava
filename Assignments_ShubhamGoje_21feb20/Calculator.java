//Program to perform calculator operations

import java.util.Scanner;

public class Calculator {
	char operator;
	double firstNumber;
	double secondNumber;
	double result;
	
	double calci(double firstNum, double secondNum, char op) {
		this.operator = op;
		this.firstNumber = firstNum;
		this.secondNumber = secondNum;
		
		switch(operator)
        {
            case '+':
                this.result = firstNumber + secondNumber;
                break;
            case '-':
                this.result = firstNumber - secondNumber;
                break;
            case '*':
                this.result = firstNumber * secondNumber;
                break;
            case '/':
                this.result = firstNumber / secondNumber;
                break;
            default:
                System.out.printf("Enter a valid operator");
        }
		return result;
	}

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		Scanner read = new Scanner(System.in);
		System.out.print("Enter First Number:");
		double first = read.nextDouble();
		System.out.print("Enter Second Number:");
        double second = read.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = read.next().charAt(0);
        calc.calci(first, second, operator);
        System.out.print("Result:"+calc.result);
        read.close();
		

	}

}
