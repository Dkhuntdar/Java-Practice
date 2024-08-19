public class area_rhombos {


        public static double calculateArea(double diagonal1, double diagonal2) {
            double area = 0.5 * diagonal1 * diagonal2;
            return area;
        }
    
        public static void main(String[] args) {
            double diagonal1 = 8.0;
            double diagonal2 = 6.0;
            double area = calculateArea(diagonal1, diagonal2);
            System.out.println("Area of the rhombus: " + area);
        }
    }
    
