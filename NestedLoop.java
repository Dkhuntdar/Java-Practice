import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Dept= in.next();
        in.close();
        switch(empID)
        {
            case 1:
            System.out.println(" Debsaran Khuntdar");          
            case 2:
            System.out.println(" BJP ");
            break;
            case 3:
            System.out.println(" Need Rojgar");
        }
            switch(Dept) 
        
            {
                case "IT": 
                System.out.println(" Software Developer");
                break;
                default : 
                System.out.println(" Its not dept");
                break;
                case "Bca":
                System.out.println(" Tech Support");
                //default : 
               // System.out.println(" Its not dept");
                
            }
            
        
    }  
}
