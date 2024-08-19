public class CalculateKilometerstoMiles {
    public class Converter {

        public static double kilometersToMiles(double kilometers) {
            return kilometers * 0.621371;
        }
    
        public static void main(String[] args) {
            double kilometers = 10.0;
            System.out.println("Kilometers to Miles: " + kilometersToMiles(kilometers));
        }
    }
    
    
}
