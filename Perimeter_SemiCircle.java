public class Perimeter_SemiCircle {
    public class Geometry {

        public static double perimeterOfSemiCircle(double radius) {
            double pi=3.14;
            return (pi * radius) + (2 * radius);
        }
    
        public static void main(String[] args) {
            double radius = 5.0;
            System.out.println("Perimeter of Semi-Circle: " + perimeterOfSemiCircle(radius));
        }
    }
    
    
}
