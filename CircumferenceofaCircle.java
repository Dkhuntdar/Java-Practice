public class CircumferenceofaCircle {
    public class Geometry {

        public static double circumferenceOfCircle(double radius) {
            return 2 * Math.PI * radius;
        }
    
        public static void main(String[] args) {
            double radius = 5.0;
            System.out.println("Circumference of Circle: " + circumferenceOfCircle(radius));
        }
    }
    
    
}
