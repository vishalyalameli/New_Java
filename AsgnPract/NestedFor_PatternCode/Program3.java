import java.util.*;
class Program3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row");

	          int Rows = sc.nextInt();

		int num = 1;

		for(int i =1 ; i <=Rows; i++){
			
			for(int j = 1; j<=Rows ; j++){
		
				System.out.print(num + " ");
		num++;                
		}
		
			System.out.println();
	}
}
}

