import java.util.*;
public class valentine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week (1-7):");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Rose Day");
                break;
            case 2:
                System.out.println("Propose Day");
                break;
            case 3:
                System.out.println("Chocolate Day");
                break;
            case 4:
                System.out.println("Teddy Day");
                break;
            case 5:
                System.out.println("Promise Day");
                break;
            case 6:
                System.out.println("Hug Day");
                break;
            case 7:
                System.out.println("Kiss Day");
                break;
            case 8:
                System.out.println("Valentine's Day");
                break;
            default:
                System.out.println("Invalid day");
        }

        scanner.close();
    }
}

