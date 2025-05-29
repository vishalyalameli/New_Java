// import java.io.*;

// public class LetterPyramid {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.print("Enter number of rows: ");
//         int row = Integer.parseInt(br.readLine());

//         for (int i = 0; i < row; i++) {
//             char ch = 'A';

//             // Print leading spaces
//             for (int j = 1; j <= row - i - 1; j++) {
//                 System.out.print("  "); // two spaces for alignment
//             }

//             // Total characters in the current row
//             int totalCols = 2 * i + 1;

//             for (int j = 1; j <= totalCols; j++) {
//                 System.out.print(ch);

//                 if (j <= totalCols / 2) {
//                     ch++;  // before center, increment character
//                 } else {
//                     ch--;  // after center, decrement character
//                 }

//                 if (j != totalCols) {
//                     System.out.print(" "); // space between letters
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

import java.io.*;

public class LetterPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for (int i = 0; i < row; i++) {
            // Compute starting character (e.g., row = 3 -> starts at 'C')
            char start = (char) ('A' + row - 1 - i);

            // Print leading spaces
            for (int j = 1; j <= row - i - 1; j++) {
                System.out.print("    "); // 4 spaces for better alignment
            }

            int totalCols = 2 * i + 1;
            char ch = start;

            for (int j = 1; j <= totalCols; j++) {
                System.out.print(ch);

                // Adjust character: increase to center, then decrease
                if (j <= totalCols / 2) {
                    ch++;
                } else {
                    ch--;
                }

                if (j != totalCols) {
                    System.out.print("   "); // space between characters
                }
            }

            System.out.println();
        }
    }
}


// import java.io.*;

// public class Pro7 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.print("Enter number of rows: ");
//         int rows = Integer.parseInt(br.readLine());

//         for (int i = 0; i < rows; i++) {
//             // Print leading spaces
//             for (int j = 0; j < rows - i - 1; j++) {
//                 System.out.print("    "); // four spaces for alignment
//             }

//             // Print left side letters
//             char ch = (char) ('A' + rows - 1 - i); // starting character
//             for (int j = 0; j < i; j++) {
//                 System.out.print(ch + "   ");
//                 ch++;
//             }

//             // Print center character
//             System.out.print((char) ('A' + rows - 1));

//             // Print right side letters
//             ch = (char) ('A' + rows - i); // one after center
//             for (int j = 0; j < i; j++) {
//                 System.out.print("   " + --ch);
//             }

//             System.out.println();
//         }
//     }
// }
