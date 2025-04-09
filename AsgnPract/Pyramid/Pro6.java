import java.util.*;

public class Pro6 {

    public  static  void main(String []args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
    
        int row = sc.nextInt();
        int num = 1;
        int col =row *2 -1 ;
        for(int i =1 ; i<=row; i++){
           
            for(int sp= 1; sp<i; sp++){
                System.out.print(" \t");
            }
            for(int j = 1; j<=col; j++){
                System.out.print( num+ " \t");
                // num++;                            2
            }
            num++;
            System.out.println();
            col = col - 2;
        }
    }
    
}

// Enter Number
// 3
// 1       1       1       1       1 
//         2       2       2
//                 3



// Enter Number                                   2
// 3
// 1       2       3       4       5 
//         6       7       8
//                 9