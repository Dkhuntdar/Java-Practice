import java.util.Scanner;

public class practice506{
    public static void main(String main){
       int a;
       int b;
       int c;
       Scanner sc=new Scanner(System.in);
        System.out.println(" Entr a string value = ");
        name =sc.next();
        sc.close();
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse+=name.charAt(0);
        }
        if(name.endsWith(reverse))
        System.out.println(name+ "=Its a palindrom character");
        else
        System.out.println(name+ "=Its not a palindrom character");

    }
}