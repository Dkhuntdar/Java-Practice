public class CalculateKilogramstoPounds {
    public class Converter {

        public static double kilogramsToPounds(double kilograms) {
            return kilograms * 2.20462;
        }
    
        public static void main(String[] args) {
            double kilograms = 5.0;
            System.out.println("Kilograms to Pounds: " + kilogramsToPounds(kilograms));
        }
    }
    
    
}
