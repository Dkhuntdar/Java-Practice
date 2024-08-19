import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Initialize variables for summing factors
        int sum = 0;
        int i = 1; // Start with the first potential factor

        // Use a do-while loop to calculate the sum of factors
        do {
            // Check if 'i' is a factor of 'number'
            if (number % i == 0) {
                sum += i; // Add the factor to the sum
            }
            i++; // Increment 'i' for the next iteration
        } while (i <= number); // Continue looping until 'i' exceeds 'number'

        // Display the result
        System.out.println("The sum of factors of " + number + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
