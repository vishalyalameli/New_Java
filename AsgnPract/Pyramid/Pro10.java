import java.util.Scanner;

public class Pro10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int row = sc.nextInt();
        int col = row * 2 - 1;
        char ch = (char)('A' + row - 1);  // Start from 'C' for row = 3  // => (char)(65 + 3) => (char)68 => 'D'

        for (int i = 1; i <= row; i++) {
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print(ch + "\t");
            }
            System.out.println();
            col -= 2;
            ch--;  // Go to previous alphabet
        }
    }
}


// Enter Number
// 3
// C       C       C       C       C
//         B       B       B
//                 A
