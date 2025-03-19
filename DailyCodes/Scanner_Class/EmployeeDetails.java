import java.util.*;
class EmployeeDetails{
	public static void main(String [ ]args){

		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter Employee Name :");
		String empName = sc.nextLine();

		System.out.println("Enter Employee Id : ");
		int empId = sc.nextInt();

		System.out.println("Enter Employee Salary: ");
		float empSalary = sc.nextFloat();

		System.out.println("Employee Name: "+ empName);
		System.out.println("Employee Id : "+ empId);
	       System.out.println("Employee Salary :" + empSalary);
	}
}



