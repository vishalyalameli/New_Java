import java.util.*;
class PrimeNum{
	public static void main(String [] arg){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number");

		int num = sc.nextInt();
		int count = 0;
		int  i =1;
		while(i<=num){
			if(num % i == 0){
				count++;
			}
			i++;
		}
		if(count == 2){
			System.out.print(num + "is Prime Number");
		}else{
			System.out.print(num + "is  not Prime Number");
		}
	}
}
