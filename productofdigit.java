import java.util.Scanner;
public class productofdigit {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int product = 1;
            
            while (number > 0) {
                product *= number % 10;
                number /= 10;
            }
            scanner.close();
            System.out.println(product);
        }
    }
    
