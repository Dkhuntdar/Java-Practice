import java.util.Scanner;
public class practice101
{
        public static void main(String[] args){
        Scanner mishra = new Scanner(System.in);
        System.out.println("koi uppercase ka daal bhi :");
        String uppercaseString = mishra.nextLine();
        String lowercaseString = uppercaseString.toLowerCase();
        System.out.println("Lowercase Hai re Sayad: " + lowercaseString);
        mishra.close();
    }
}

           
    
