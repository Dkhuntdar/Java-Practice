import java.util.Scanner;
public class Practice5
    {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any number");
            int a = sc.nextInt();
            sc.close();
            int count=0;
            for(int i=1; i<=a;i++){
                if(a%i==0)
                {
                    count++;
                }

            }
            if(count==2)
            System.out.println("Its a prime number");
            else
            System.out.println("Its not a prime number");
            
        }
            
}