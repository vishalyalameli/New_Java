import java.util.*;
class Pro4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows");

		int Rows = sc.nextInt();

		for(int i = 1 ; i<=Rows ; i++){
			int num = i ;

			for( int j = 1; j<=Rows - 1; j++){
				System.out.print( num + " ");
				num++;
			}
			for( int k = 1 ; k<=Rows -i; k++){
				System.out.print(" ");
			}

			num =  i + Rows -1 ; 

			for(int l = 1; l <=i; l++){
				System.out.print( num + " ");
			num++;
			}
			System.out.println();

			
		}
	}
}

    
