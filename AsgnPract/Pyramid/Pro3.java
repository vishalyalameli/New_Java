import  java.util.*;
public record Pro3() {

    public  static  void main(String []args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");

    int row = sc.nextInt();
    int num = 1;
    int col =1 ;
    for(int i =1 ; i<=row; i++){
       
        for(int sp= 1; sp<= row-i; sp++){
            System.out.print(" \t");
        }
        for(int j = 1; j<=col; j++){
            System.out.print( num+ " \t");
            num++;
            num++;
        }
        System.out.println();
        col = col +2;
    }
}
}
    

// Enter Number
// 3
//                 1 
//         3       5       7
// 9       11      13      15      17


