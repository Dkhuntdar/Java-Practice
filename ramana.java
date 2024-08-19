import java.util.*;
public class ramana{

    public static void main(String[] args) {
        int[] salaries = {7000, 20000, 2000, 3000, 40000};
        double[] expenses = {70.0, 54.9, 43.98, 43.98, 43.98};
        List<Double> moneySentHome = new ArrayList<>();
        double totalMoneySent = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (i == 2) {
                moneySentHome.add(0.0);  // 3rd person sends nothing
                continue;
            }
            double expenseAmount = (salaries[i] * expenses[i]) / 100;
            double amountSent = salaries[i] - expenseAmount;
            moneySentHome.add(amountSent);
        }

        for (int i = 0; i < moneySentHome.size(); i++) {
            System.out.println("Child " + (i + 1) + " will send home: " + moneySentHome.get(i) + " Rs.");
        }
        System.out.println("Total money sent home by the boys: " + totalMoneySent + " Rs.");
    }
}

