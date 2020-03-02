//Program to print employee details

public class Employee1 {
	
	String empName;
	String empOrg;
	long empID;
	long empSal;
	int empExp;
	
	public void empDetails(String name, String orgName, long employeeID, long salary, int experience) {
		this.empName=name;
		this.empOrg=orgName;
		this.empID=employeeID;
		this.empSal=salary;
		this.empExp=experience;
		System.out.println("Name Of Employee:"+name);
		System.out.println("Name Of Organization:"+orgName);
		System.out.println("Employee ID:"+employeeID);
		System.out.println("Salary:"+salary);
		System.out.println("Years Of Experience:"+experience);
		
		
	}
	public static void main(String[] args) {
		Employee E1 = new Employee();
	    E1.empDetails("Shubham","Cognizant", 876543, 349904, 3);
	}
	
}