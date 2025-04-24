class Employee{
	int empId;
	String empName;

	void empinfo( int empId , String empName){  // local variable  and instance variable are same 
		System.out.println(this.empId); // 0  by default  
		System.out.println(this.empName);//null 

		this.empId = empId; // store 
		this.empName = empName;// Store the value use construcotor parameter value

		System.out.println(this.empId); // 10 
		System.out.println(this.empName);// vishal
	}
	public static void main(String[] args){
		Employee obj = new Employee();
		obj.empinfo( 10 , "vishal"); // pass the argument
	}
	}
 /* 
  * o/p : 0 
  *      null
  *      10
  *      Vishal
  *
  *
  * */

