public class SimpleInterest {
    public class Finance {

        public static double simpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }
    
        public static void main(String[] args) {
            double principal = 1000.0, rate = 5.0, time = 2.0;
            System.out.println("Simple Interest: " + simpleInterest(principal, rate, time));
        }
    }
    
    
}
