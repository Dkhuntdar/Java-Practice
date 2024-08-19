public class Area_SemiCircle {
    
    public class Geometry {

        public static double areaOfSemiCircle(double radius) {
            return (Math.PI * radius * radius) / 2;
        }
    
        public static void main(String[] args) {
            double radius = 5.0;
            System.out.println("Area of Semi-Circle: " + areaOfSemiCircle(radius));
        }
    }
}
    
