import java.util.*;
class Pro14{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number");

		int row= sc.nextInt();

		for(int i = 1; i<=row; i++){
			for(int j =1;  j<= ((row*2)-i); j++){
				if(j<i){
					System.out.print("  ");
				}
				else if(j<=row){
					System.out.print(((j+1)-i)+ "  ");
				}
				else{
					System.out.print(((row*2)-(j+i-1))+"  ");
				
				}
			}

				System.out.println();
		}
	}

}
