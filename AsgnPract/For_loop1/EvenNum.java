import java.util.*;
class EvenNum{
	public static void main(String [ ]args){
		Scanner sc = new Scanner(System.in);
                 System.out.println("Enter  Number");
		int Num= sc.nextInt();
		for(int i = 2 ; i<=Num; i++ ){
			System.out.print(i);
			if(i % 2 == 0){
				System.out.print(", ");
			}
			i++;
		
		}
		System.out.println();
	}
}
