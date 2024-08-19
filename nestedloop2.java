import java.util.Scanner;
public class nestedloop2 {
    public static void main(String[] args)
    {
    //    Scanner in = new Scanner(System.in);
    //    //System.out.println(" Enter the Main Party Name ");
    //    int BJP = in.nextInt();
    //   // System.out.println(" Enter the ");
    //    String INC = in.next();
    //    in.close();
    //    switch(BJP)
    //    {
    //     case 1 -> System.out.println(" Narendra Modi");
    //     case 2 -> System.out.println(" Amit Shah");
    //     case 3 -> {
    //         System.out.println(" Nitish Kumar");
    //     switch (INC)
    //     {
    //         case "IT" -> System.out.println(" Dhurv Rathee");
    //         case "RH" -> System.out.println(" Mamata banarjee");
    //         case "Delhi " -> System.out.println(" Arvind kejriwal");


    //     }
    // }
    //     default -> System.out.println(" Congress Haar Gyi");
    

      Scanner in = new Scanner(System.in);
      int tuition = in.nextInt();
      String student = in.next();
      in.close();
      switch(tuition)
      {
        case 1 :
        System.out.println("Teacher");
        break;
        case 2 :
        System.out.println("Students");
        default :
        System.out.println(" Mohit Dhemna ");

      }
      switch(student)
      {
        case "Gm" :
        System.out.println("Debsaran khuntdar");
        break;
        case "Gs":
        System.out.println("Mohit");
        break;
        default :
        System.out.println(" No one is there ");
      }


       }


        
    }
    

