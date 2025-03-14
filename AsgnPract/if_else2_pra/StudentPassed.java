import java.util.*;
class StudentPassed{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks ");

		double Marks = sc.nextDouble();

		if(Marks >= 85.00){
			System.out.println("Passed : O Grade With Distinction");
		}else if(Marks <= 85.00  && Marks >= 60){
			System.out.println("Passed :First Class With Distinction");
		}else if(Marks <= 59.00 && Marks >= 45.00){
			System.out.println("Passed :Second Class with Distinction");
		}else if(Marks <= 45 && Marks  >= 35){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		sc.close();
	}
}

