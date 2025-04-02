import java.util.*;
class Pro9{
	public  static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
                    int Rows = sc.nextInt();
		    
		    for (int i = 0; i<Rows ; i++){
			    int num =i+ 1;
			    for(int j = 0; j<Rows - i; j++){
				    System.out.print(num + " ");
			            num++;          

			    }
			    
			    
			    System.out.println();
		    }
	}
}


