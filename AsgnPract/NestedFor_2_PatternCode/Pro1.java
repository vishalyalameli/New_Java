import java.util.*;
class Pro1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
                 System.out.println("Enter Rows");
		int Rows  = sc.nextInt();

		int num = 1;

		for(int  i = 1 ; i<=Rows; i++){
			for(int j = 1; j<=Rows; j++){
				System.out.print( num + " ");
				num++;
			}
			System.out.println();
			num--;
		}
	}
	
}

//3 
//1 2 3 
//3 4 5
//5 6 7
