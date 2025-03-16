import java.util.*;
class EvenOddNegativeNum{
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);


	 System.out.println("Enter the number :");
	int num = sc.nextInt();

	if(num <0){
		System.out.println("Sorry Negative Number are not allowed");
	}else if( num %2 ==0){
		System.out.println("Number is even");
	}else{
		switch (num)
		{
			default : System.out.println("Number is odd");
		}
	}
	}
}


