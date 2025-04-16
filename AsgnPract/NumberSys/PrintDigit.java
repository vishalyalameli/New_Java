import java.util.*;
class PrintDigit{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int num = sc.nextInt();
                 System.out.println("Digits are the number");
		while(num > 0){
			int digit = num % 10;
			System.out.print(digit+ ",");
			num /= 10;
		}
	}
}








