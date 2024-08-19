public class pattern10 {

        public static void main(String[] args) {
            int n = 4; // Number of rows
    
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = n - 1; j >= i; j--) {
                    System.out.print(" ");
                }
    
                // Print stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
    
                // Move to the next line
                System.out.println();
            }
        }
    }
    
