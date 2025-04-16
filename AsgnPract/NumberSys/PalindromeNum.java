import java .util.*;
class PalindromeNum{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter Number");

		int num =sc.nextInt();
		 int reverse = 0 , temp = num;

		 while( num > 0){
			 int digit =  num % 10 ;
			 reverse = reverse *10 + digit;
			 num /= 10;
		 }
	           if(temp == reverse){
			   System.out.println( reverse + " is Palindrome Number");
		   }else{
			   System.out.println( reverse + " is not Palindrome Number");
		   }
	}
}
