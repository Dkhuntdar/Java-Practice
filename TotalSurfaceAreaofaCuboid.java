public class TotalSurfaceAreaofaCuboid {
    public class Geometry {

        public static double totalSurfaceAreaOfCuboid(double length, double width, double height) {
            return 2 * (length * width + width * height + height * length);
        }
    
        public static void main(String[] args) {
            double length = 4.0, width = 3.0, height = 2.0;
            System.out.println("Total Surface Area of Cuboid: " + totalSurfaceAreaOfCuboid(length, width, height));
        }
    }
    
    
}
