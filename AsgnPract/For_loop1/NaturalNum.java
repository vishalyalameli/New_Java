import java.util.*;
class NaturalNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int Num = sc.nextInt();

		for(int i = 1; i<=Num; i++){
			System.out.print(i);
			if( i < Num){
				System.out.print(", ");
			}
		}
		System.out.println();

	}
}
