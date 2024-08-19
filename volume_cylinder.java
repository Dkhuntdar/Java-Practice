public class volume_cylinder {
    //write a function to calculate volume of cylinder

        public static double calculateVolume(double radius, double height) {
            double PI=3.14;
            double volume = PI * radius * radius * height;
            return volume;
        }
    
        public static void main(String[] args) {
            double radius = 5.0;
            double height = 10.0;
            double volume = calculateVolume(radius, height);
            System.out.println("Volume of the cylinder: " + volume);
        }
    }
    
