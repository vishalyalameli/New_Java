import java.util.*;
class Pro10{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);
                 System.out.println("Enter Rows");
		int Rows = sc.nextInt();

		for(int i = 0 ; i<Rows; i++){
			System.out.print("#\t");
		}
		System.out.println();

		for(int i = 0; i<Rows; i++){
			System.out.print("$\t");
		}
		System.out.println();

		for(int i = 0; i<Rows; i++){
			System.out.print("@\t");
		}
		System.out.println();
	}
}


