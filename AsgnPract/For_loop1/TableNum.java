import java.util.*;
class  TableNum{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");

		int N = sc.nextInt();

		for(int i = 1; i<=10; i++){
			System.out.print(N*i);
			if(i<10){
				System.out.print(", ");
			}
		}
	}
}
