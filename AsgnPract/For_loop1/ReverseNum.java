import java.util.*;
class ReverseNum{
	public static void main(String [ ]args){
		Scanner sc = new Scanner(System.in);
                 System.out.println("Enter  Number");
		int Num= sc.nextInt();
		for(int i = Num ; i>=0; i -- ){
			System.out.print(i);
			if(i > 0 ){
				System.out.print(", ");
			}
			
		
		}
		System.out.println();
	}
}
