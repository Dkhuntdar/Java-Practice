import java.util.Scanner;
public class Methoddd 
{
    // public static void add()
    // {
    //     int a=10, b=20;
    //     System.out.println(" Result is = " + (a+b));
    // }
    // public static void main(String[] args) 
    // {
    //     Methoddd sc = new Methoddd();
    //     //r.Deb();
    //     Methoddd.add();
    // sc.Deb();

    //  }
    
    //     void Deb()
    //     {
    //         System.out.println(" Debsaran Don Of jargo");
        
    //     }
    public static int addValue(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println(" Enter the value of b = ");
        int b = sc.nextInt();
        sc.close();
        int sum =addValue(a,b);
        System.out.println(" Sum of two numbers " + sum);
        


    }
    
}
