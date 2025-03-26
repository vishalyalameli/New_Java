import java.util.*;
class WholeNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int Num = sc.nextInt();

		for(int i = 0; i<=Num; i++){
			System.out.print(i);
			if( i < Num){
				System.out.print(", ");
			}
		}
		System.out.println();

	}
}
