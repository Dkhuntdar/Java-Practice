import java.util.Scanner;

public class digitcounter{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        // Handle the case where the number is zero
        int digitCount;
        if (number == 0) {
            digitCount = 1;
        } else {
            // Count digits using division
            digitCount = 0;
            while (number > 0) {
                number /= 10;
                digitCount++;
            }
        }
        sc.close();

        System.out.println("The number of digits in the given number is: " + digitCount);
    }
}
