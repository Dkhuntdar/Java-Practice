
import java.util.Scanner;
//write a program to find whether the number is prime number or not
public class CubeOfSum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number= ");
        int a=sc.nextInt();
        int count=0;
        sc.close();
        for(int i=1;i<=a;i++)
        {
            if (a%i==0){
                count++;
            }
        }
        if(count==2)
        System.out.println("Its a prime number");
        else
        System.out.println(" not Prime number");



    }
}

