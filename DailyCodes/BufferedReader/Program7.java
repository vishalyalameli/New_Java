import java.util.*;
class Program7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number1");
		
		int num = sc.nextInt();

		System.out.println("Enter Number2");
		int num2 = sc.nextFloat(); // incompatible possibly lossy comversion

		System.out.println(num);
		System.out.println(num2);



	}
}
