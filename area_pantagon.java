import java.util.Scanner;
public class area_pantagon {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the length of a side of the pentagon: ");
            double side = scanner.nextDouble();
            scanner.close();
    
            // Calculate the area
            double area = (1.0 / 4) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(side, 2);
    
            System.out.println("The area of the pentagon is: " + area);
        }
    }
    
