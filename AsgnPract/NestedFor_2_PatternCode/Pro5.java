import java.util.*;
class Pro5{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int Rows = sc.nextInt();

		int num= 1;
		char ch = 'c';
		for(int i = 1; i<=Rows; i++){
			for(int j = 1; j<=Rows; j++){
				System.out.print(ch + "" + num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
// 3 
// c1 c2 c3
// c2 c3 c4
// c3 c4 c5
