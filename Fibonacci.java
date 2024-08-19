import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = scanner.nextInt(); // Read user input for the number of terms

        int a = 1; // First Fibonacci number
        int b = 2; // Second Fibonacci number
        int i = 0; // Iterator
        
        System.out.println("Fibonacci Sequence up to " + n + " terms:");
        
        do {
            System.out.println(a); // Print the current Fibonacci number
            
            // Calculate the next Fibonacci number
            int next = a + b;
            
            // Update the previous two numbers
            a = b;
            b = next;
            
            i++; // Increment the iterator
        } while (i < n);

        scanner.close(); // Close the scanner
    }
}

