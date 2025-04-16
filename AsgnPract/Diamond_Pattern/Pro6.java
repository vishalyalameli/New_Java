import java.util.Scanner;

public class Pro6 {
    public static void main(String [ ]args){
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Number");

		int row= sc.nextInt();
		int space, col =1;
		int num;

		for(int i = 1; i<row*2 ; i++){
			if(i<=row ){
				space =row -i;
				col = i*2 -1;
                num=i;
			}else{
				space = i-row;
				col=col-2;
                num = 2*row-i;
			}
			for(int sp = 1 ; sp<=space; sp++){
				System.out.print(" \t");
			}
			for(int j =1; j<=col ; j++){
				System.out.print( num +"\t");
               
				
			}
            
			
			System.out.println();
           
		}
	}

    
}

/*

Enter Number
4
                        1
                2       2       2
        3       3       3       3       3
4       4       4       4       4       4       4
        3       3       3       3       3
                2       2       2
                        1

 
 */
