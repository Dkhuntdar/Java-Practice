public class leapyear {
        public static void main(String[] args) {
            for (int year = 2000; year <= 2100; year++) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(year);
                }
            }
        }
    }
    
