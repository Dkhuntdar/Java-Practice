public class ShadowingExample {
        int x = 10; // Instance variable
    
        public void printX() {
            int x = 20; // Local variable shadows the instance variable
            System.out.println("Local x: " + x); // Prints 20
        }
    
        public void printOuterX() {
            System.out.println("Instance x: " + x); // Prints 10
        }
    
        public static void main(String[] args) {
            ShadowingExample example = new ShadowingExample();
            example.printX();
            example.printOuterX();
        }
    }
    
