import java.util.*;
class Factorial{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int num = sc.nextInt();

		int factorial = 1;

		for(int i = 1; i<= num; i++){
			factorial *= i;
		}
		System.out.println("Factorial number " + num +  " is" + factorial);
	}
}
 


//
