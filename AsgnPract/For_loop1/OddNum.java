import java.util.*;
class OddNum{
	public static void main(String [ ]args){
		Scanner sc = new Scanner(System.in);
                 System.out.println("Enter  Number");
		int Num= sc.nextInt();
		for(int i = 1 ; i<=Num; i +=2 ){
			System.out.print(i);
			if(i % 2  !=0 ){
				System.out.print(", ");
			}
			
		
		}
		System.out.println();
	}
}
