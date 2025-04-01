import java.util.*;
class Pro3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

	System.out.println("Enter Rows");

	int Rows = sc.nextInt();

	

	for(int i = 1; i<= Rows; i++){
		for(char ch = 'c'; ch>= 'a'; ch--){
			System.out.print(ch + " ");
		        
		}
		
		System.out.println();
	}
	
	}
}
