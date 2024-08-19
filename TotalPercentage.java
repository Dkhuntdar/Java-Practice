public class TotalPercentage {
    public class Education {
        public static double totalPercentage(double[] marks) {
            double total = 0;
            for (double mark : marks) {
                total += mark;
            }
            return (total / (marks.length * 80)) * 100;
        }
    
        public static void main(String[] args) {
            double[] marks = {72.0, 68.0, 75.0, 70.0};
            System.out.println("Total Percentage: " + totalPercentage(marks) + "%");
        }
    }
    
    
}
