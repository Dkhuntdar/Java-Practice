import java.util.Scanner;
public class reversenumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int reverse = 0;
    
            while (number != 0) {
                reverse = reverse * 10 + number % 10;
                number /= 10;
            }
    
            System.out.println(reverse);
            scanner.close();
        }
    }
    
