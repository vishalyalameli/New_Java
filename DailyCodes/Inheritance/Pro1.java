class Company{
	String cmpName = "Microsoft";
	String cmpLoc = "Pune";

	void cmpInfo(){
		System.out.println(cmpName);
		System.out.println(cmpLoc);
	}
}
	class Employee extends Company{
		String  empName = "Vishal";
		double  empSal = 2.5;

		void empInfo(){
			System.out.println(empName);
			System.out.println(empSal);
		}
	}
class client{

	public static void main(String [] args){
		Employee sc = new Employee();
		sc.empInfo();
		sc.cmpInfo();
	}
}

