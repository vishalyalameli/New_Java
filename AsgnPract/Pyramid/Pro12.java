import java.util.*;
class Pro12{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");

		int row= sc.nextInt();

		for(int  i =1; i<=row; i++){
			
			for(int sp =1 ; sp < i; sp++){
				System.out.print("  ");
			}

			for(int j = 1; j<=(((row-i)*2)+1); j++){
				if(j <=((row-i)+1)){

				System.out.print(j+ " ");

				}else{
					System.out.print(((row *2) -j) + " ");

		}
                 
		}

		System.out.println();
	}
}
}

      /* 1   2    3   4   3   2  1
             1    2   3	 2    1
	          1   2   1
		       1      */
                 
