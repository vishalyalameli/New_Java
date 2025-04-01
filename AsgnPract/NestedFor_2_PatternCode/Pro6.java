import java.util.*;
class Pro6{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int Rows = sc.nextInt();

		
		
		for(int i = Rows; i>=1; i--){
			int num = i;
			for(int j = 1; j<= Rows; j++){
				System.out.print(num + " ");
				num = num+Rows;
			}
			System.out.println();
		}
	}

}
// 3 
// 3  6  9
// 2  5  8
// 1  4  7
