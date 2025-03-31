import  java.util.*;
class  ReverseTable{
	public static void main (String  [] args){

		Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number");
		int num = sc.nextInt();

		

		for(int i = 10; i >=1 ;i--){
			System.out.print( num *i);
			if(i >1 ){
				System.out.print(" ,  ");
			}
		
		}
	}
}
