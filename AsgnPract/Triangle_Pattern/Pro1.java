import java.util.*;
class Pro1{
	public  static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
                    int Rows = sc.nextInt();
		    
		    for (int i = 1; i<=Rows ; i++){
			    for(int j = 1; j<=i; j++){
				    System.out.print("*   ");
				    

			    }
			    System.out.println();
		    }
	}
}


