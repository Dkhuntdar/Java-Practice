public class DiamondPattern {
        public static void main(String[] args) {
            int n = 4; // Number of rows for the top half
    
            // Top half
            for (int i = 1; i <= n; i++) {
                for (int j = n - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            // Bottom half
            for (int i = n - 1; i > 0; i--) {
                for (int j = n - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
