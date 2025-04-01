import java.util.*;
class Pro2{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);
                  System.out.println("Enter Rows");
		int Rows = sc.nextInt();
                
		
		for(int i = 1; i<=Rows; i++){
			if( i % 2 == 1){
				for(char ch = 'D' ; ch >='A'; ch--){

				System.out.print( ch + " ");
				
			}
			}else{
				for(char ch = 'A'; ch<='D'; ch++){
					System.out.print(ch + " ");
				}
			}
			
			System.out.println();
		}
	}
}
