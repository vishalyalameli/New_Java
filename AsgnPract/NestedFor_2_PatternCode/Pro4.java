import java.util.*;
class Pro4{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int Rows = sc.nextInt();

		int num= 1;
		for(int i = 1; i<=Rows; i++){
			for(int j = i; j< i + Rows; j++){
				System.out.print(j + " ");
				
			}
			System.out.println();
		}
	}

}
// 3 
// 1 2 3
// 2 3 4
// 3 4 5
