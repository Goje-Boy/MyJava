//Program to print employee details

public class Employee {
	
	public void empDetails(String Name, String OrgName, long EmpID, long Salary, int Exp) {
		System.out.println("Name Of Employee:"+Name);
		System.out.println("Name Of Organization:"+OrgName);
		System.out.println("Employee ID:"+EmpID);
		System.out.println("Salary:"+Salary);
		System.out.println("Years Of Experience:"+Exp);
		
	}
	public static void main(String[] args) {
		Employee E1 = new Employee();
	    E1.empDetails("Shubham","Cognizant",876543,50000,2);
	}
	
}
