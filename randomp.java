import java.util.Scanner;

public class randomp{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a day " );
        int Day = sc.nextInt() ;
        sc.close();
        switch (Day)
        {
            case 7 -> System.out.println(" Debsaran Khuntdar");
            case 8 -> System.out.println(" Propose Day ");
            case 9 -> System.out.println(" Chocolate Day ");
            case 10 -> System.out.println(" Teddy Day ");
            case 11-> System.out.println(" Promise Day ");
            case 12-> System.out.println(" Hug Day");
            case 13-> System.out.println(" Kiss Day ");
            case 14-> System.out.println(" Valentine's Day ");
            default -> System.out.println(" Please select a valuable day");

        }
        
    }
}