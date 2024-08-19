public class TotalSurfaceAreaCube {
    public class Geometry {

        public static double totalSurfaceAreaOfCube(double side) {
            return 6 * side * side;
        }
    
        public static void main(String[] args) {
            double side = 4.0;
            System.out.println("Total Surface Area of Cube: " + totalSurfaceAreaOfCube(side));
        }
    }
    
}
