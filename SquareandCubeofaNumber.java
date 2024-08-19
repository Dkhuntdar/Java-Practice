public class SquareandCubeofaNumber {
    public class MathOperations {

        public static double squareOfNumber(double number) {
            return number * number;
        }
    
        public static double cubeOfNumber(double number) {
            return number * number * number;
        }
    
        public static void main(String[] args) {
            double number = 3.0;
            System.out.println("Square of Number: " + squareOfNumber(number));
            System.out.println("Cube of Number: " + cubeOfNumber(number));
        }
    }
    
    
}
