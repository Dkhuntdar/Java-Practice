import java.util.Scanner;
public class oddNumber {
    public static void main(String[] args)
    {
       char ch;
       Scanner sc = new Scanner(System.in);
       System.out.println(" Enter any Alphabet");
       ch = sc.next().charAt(0);
       sc.close();
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
       {
        System.out.println(" Its a Vowel");
       }
       else
       System.out.println(" Its a Constant ");
    }
    
}
