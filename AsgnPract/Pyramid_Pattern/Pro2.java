import java.util.*;

class Pro2{
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Number");
        int rows= sc.nextInt();

        char ch = 'A';

        for(int i = 1 ; i<=rows; i++){
            for( int sp = 1 ; sp<=rows-i; sp++){
                System.out.print( "\t");
            }
            for(int j = 1; j<= 2 *i - 1 ; j++){
                          System.out.print(ch + "\t");
                                                                                 //ch++;                       ***  inside write then the increase the number changes
                                                                                          /*
                                                                                            Enter Number
                                                                                            3
                                                                                                            A
                                                                                                    B       C       D        
                                                                                            E       F       G       H       I
                         
                          
                                                                                             */

                          

            }
            ch++;                                        
            System.out.println();
        }

    }
}

/*
 * Enter Number
3
                A
        B       B       B
C       C       C       C       C
 */