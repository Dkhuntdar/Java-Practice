import java.util.Scanner;
public class pefectNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println("It's a perfect number");
        } else {
            System.out.println("It's not a perfect number");
        }

        sc.close();
    }
}

    
