import java.util.*;
class TableNum{
	public  static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int Num = sc.nextInt();

		for(int  i = 1 ; i<Num; i++){
			System.out.print( Num * i);
			if(i <10){
				System.out.print(Num + " ");
			}
			System.out.println();
		}
	}
}
