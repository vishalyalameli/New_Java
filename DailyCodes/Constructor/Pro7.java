import java.util.*;
class Employee{
	int empId;
	String empName;

	Employee(int empId , String empName){
		this.empId = empId;
		this.empName = empName;

		System.out.println("Parameter Constructor");

	}
	void  empInfo(){
		System.out.println("empId " + empId);
		System.out.println( "empName "+ empName);
	}
}
class client{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int empId = sc.nextInt();

		System.out.println("Write Name");
		String empName = sc.next();

		Employee obj =  new Employee(empId, empName);
		obj.empInfo();
	}
}
