import java.util.Scanner;

public class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = 0;

        
        while (num > 0) {
            int digit = num % 10;  // Extract the last digit

            // Check if the digit is even
            if (digit % 2 == 0) {
                sum += digit;  // Add the even digit to the sum
            }

            num /= 10;  // Remove the last digit
        }

        System.out.println("Sum of even digits: " + sum);
    }
}

// Enter a number:
// 123
// Sum of even digits: 2
