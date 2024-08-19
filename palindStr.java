import java.util.Scanner;
public class palindStr {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println(" Enter any string value ");
            String str = sc.nextLine();
            sc.close();
            boolean isPalindrome = true;
            int length = str.length();
            for (int i = 0; i < length ; i++) {
                if (str.charAt(i) != str.charAt(length-1- i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
    
