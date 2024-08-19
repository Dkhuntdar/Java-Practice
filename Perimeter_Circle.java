public class Perimeter_Circle {
    public class Geometry {

        public static double perimeterOfCircle(double radius) {
            double PI=3.14;
            return 2 *PI * radius;
        }
    
        public static void main(String[] args) {
            double radius = 5.0;
            System.out.println("Perimeter of Circle: " + perimeterOfCircle(radius));
        }
    }
    
    
}
