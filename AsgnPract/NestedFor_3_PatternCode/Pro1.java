import java.util.*;
class Pro1{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);

		int Rows = sc.nextInt();
                
		char ch = (char)('A' + Rows -1);
		for(int i = 0; i<Rows; i++){
			
			for(int j= 0; j<Rows; j++){
				System.out.print( ch + " ");
				
			}
			ch--;
			System.out.println();
		}
	}
}
