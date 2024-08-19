import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n>0){
            int r=n%10;
            n=n/10;
            sum=(sum+(r*r*r));
        }
        if(sum==temp)
        System.out.println("Its an amstrong number");
        else
        System.out.println("Its not an amstrong number");
        sc.close();
    }
}
