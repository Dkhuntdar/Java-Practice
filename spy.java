import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        //int temp = n;
        int sum = 0;
        int p=1;
        while(n>0){
            int r=n%10;
            n=n/10;
            p*=r;
            sum=(sum+r);
        }
        if(sum==p)
        System.out.println("Its an spy number");
        else
        System.out.println("Its not a spy number");
        sc.close();
    }
}

