import java.util.*;
class Pro2{
	public static void main(String [ ]args){
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Number");

		int row= sc.nextInt();
		int space, col =1;

		for(int i = 1; i<row*2 ; i++){
			if(i<=row ){
				space =row -i;
				col = i*2 -1;
			}else{
				space = i-row;
				col=col-2;
			}
			for(int sp = 1 ; sp<=space; sp++){
				System.out.print(" \t");
			}
			for(int j =1; j<=col ; j++){
				System.out.print("1\t");
			}
			System.out.println();
		}
	}
}
