import java.util.*;
class Program6{
	public static  void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows");

		int Rows = sc.nextInt();
		int num =Rows;

		for(int i = 1; i<=Rows; i++){
			for(int j = Rows ; j>=1; j--){
			
				System.out.print( j+ "  ");
			      
			
			}
			System.out.println();
			
				
		}
	}
}
