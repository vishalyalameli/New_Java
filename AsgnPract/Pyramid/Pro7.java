import  java.util.*;

public class Pro7 {

    public  static  void main(String []args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
    
        int row = sc.nextInt();
        int num = 2;
        int col =row *2 -1 ;
        for(int i =1 ; i<=row; i++){
           
            for(int sp= 1; sp<i; sp++){
                System.out.print(" \t");
            }
            for(int j = 1; j<=col; j++){
                System.out.print( num+ " \t");
                 num =num +2 ;                           
            }
            
            System.out.println();
            col = col - 2;
        }
    }
    
}

// Enter Number
// 3
// 2       4       6       8       10 
//         12      14      16
//                 18
