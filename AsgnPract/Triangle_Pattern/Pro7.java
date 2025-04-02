import java.util.*;
class Pro7{
	public  static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
                    int Rows = sc.nextInt();
		    
		    for (int i = 0; i<Rows ; i++){
			    int num = Rows- i ;
			    for(int j = 0; j<Rows-i; j++){
				    System.out.print(num + " ");
			              

			    }
			    
			    System.out.println();
		    }
	}
}


