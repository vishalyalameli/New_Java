import java.util.*;

public class Pro5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int row = sc.nextInt();
        int col = 1;
        //int ch = 65;                                      bottom output
       

        for (int i = 1; i <= row; i++) {

            int ch = 65;

            for (int sp = 1; sp <= row - i; sp++) {
                System.out.print(" \t");
            }

            for (int j = 1; j <= col; j++) {
                if (i == 2) {
                  
                    System.out.print((char)(ch + 32) + "\t");
                } else if (i == 3 && j == 3) {
                 
                    System.out.print((char)(ch + 32) + "\t");
                } else {
                
                    System.out.print((char)ch + "\t");
                }
                ch++;
            }

            System.out.println();
            col = col + 2;
        }
    }
}

// Enter Number
// 3
//                 A
//         a       b       c
// A       B       c       D       E

// Enter Number
// 3
//                 A
//         b       c       d
// E       F       g       H       I


