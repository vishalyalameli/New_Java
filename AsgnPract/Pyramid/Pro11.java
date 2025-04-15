import java.util.*;
class Pro11{
	public static void main(String [ ] args)
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int row =sc.nextInt();

	int col = row*2-1;
		

		for(int i =1; i<=row; i++){
	           int num =1;
		for(int sp =1 ; sp<i; sp++){
			System.out.print(" \t");
		}
		for(int j = 1 ; j<= col; j++){
			if(j< (row+1 -i)){
				System.out.print(num +" ");
				num++;
			}else{
				System.out.print(num + " ");
                                num--;
			}
			
			System.out.println();
			col= col-2;



		
		}
		}


	}
}
