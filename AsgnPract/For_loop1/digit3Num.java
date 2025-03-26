import java.util.*;
class digit3Num{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int Num = sc.nextInt();
                int N = 100;
		for(int i =0; i<Num; i++){
			System.out.print(N);
			if( i < Num-1){
				System.out.print(", ");
			}
			N++;
		}
		System.out.println();

	}
}
