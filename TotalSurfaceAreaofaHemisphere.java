public class TotalSurfaceAreaofaHemisphere {
    public class Geometry {

        public static double totalSurfaceAreaOfHemisphere(double radius) {
            double PI=3.14;
            return 3 *PI * radius * radius;
        }
    
        public static void main(String[] args) {
            double radius = 5.0;
            System.out.println("Total Surface Area of Hemisphere: " + totalSurfaceAreaOfHemisphere(radius));
        }
    }
    
    
}
