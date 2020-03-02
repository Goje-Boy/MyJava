//Program to calculate EMI

public class EmiCalculator {
	double loanAmount;
	double employeeID;
	double emi;

	public double EmiCal(double loanAmt, double empID) {
		this.loanAmount = loanAmt;
		this.employeeID = empID;
		
		if(loanAmount>500000) {
			this.emi = 0.1 * this.loanAmount;
		}
		
		return emi;
	}

	public static void main(String[] args) {
		
		EmiCalculator E1 = new EmiCalculator();
		E1.EmiCal(600000,876553);
		System.out.println("Emi For the loan is:"+E1.emi);
		
		EmiCalculator E2 = new EmiCalculator();
		E2.EmiCal(550000,876553);
		System.out.println("Emi For the loan is:"+E2.emi);

	}

}
