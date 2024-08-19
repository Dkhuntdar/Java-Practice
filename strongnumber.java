import java.util.*;
public class strongnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a strong number.");
        } else {
            System.out.println(originalNumber + " is not a strong number.");
        }
        scanner.close();
    }
}

    

