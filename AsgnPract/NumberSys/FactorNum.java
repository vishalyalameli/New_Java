import java.util.*;
class FactorNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int num = sc.nextInt();

		for(int i =1 ; i<=num; i++){
			if(num %i == 0){
		         	System.out.print(i + ",");
			}
		}
		System.out.println("Factors of the Number "+num+ "are:" );

	}
}
