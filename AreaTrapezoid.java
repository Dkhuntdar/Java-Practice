public class AreaTrapezoid {
    public class Geometry {

        public static double areaOfTrapezoid(double base1, double base2, double height) {
            return ((base1 + base2) / 2) * height;
        }
    
        public static void main(String[] args) {
            double base1 = 5.0, base2 = 7.0, height = 4.0;
            System.out.println("Area of Trapezoid: " + areaOfTrapezoid(base1, base2, height));
        }
    }
    
    
}
