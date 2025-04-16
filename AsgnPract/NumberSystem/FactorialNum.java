import  java.util.*;

public class FactorialNum {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        
        long factorial = 1;
        
        for(int i = 1; i<=num; i++){
        //factorial *= i;
        factorial = factorial*i;
        }

        
        System.out.println("factorial of" + num + "is " + factorial);
        

    }
 
}

// Enter Number
// 5
// factorial of5is 120