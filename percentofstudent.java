import java.util.Scanner;
public class percentofstudent {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate percentage
        double percentage = (double) totalMarks / (numSubjects * 100) * 100;

        // Determine performance category
        String performanceCategory;
        if (percentage > 90) {
            performanceCategory = "Excellent";
        } else if (percentage > 80) {
            performanceCategory = "Very Good";
        } else if (percentage > 70) {
            performanceCategory = "Good";
        } else if (percentage > 60) {
            performanceCategory = "Satisfactory";
        } else if (percentage > 50) {
            performanceCategory = "Average";
        } else {
            performanceCategory = "Poor";
        }

        // Output results
        System.out.printf("Total Marks: %d\n", totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Performance: " + performanceCategory);

        scanner.close();
    }
}

