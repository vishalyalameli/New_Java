import java.util.*;
class SumNaturalNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int num = sc.nextInt();
                int Sum = 0;
		for(int i = 1; i<=num; i++){
			
			Sum += i;
		}
		                		System.out.println("Sum of First"+ num+  "natural num :" +Sum);
			
		}
	}

