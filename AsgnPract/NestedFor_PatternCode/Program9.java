import java.util.*;
class Program9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows");

		int Rows = sc.nextInt();
		
		for(int i = 1; i<=Rows; i++){
			char ch = 'A';
			for(int j= 1; j<=Rows; j++){
				System.out.print( ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
