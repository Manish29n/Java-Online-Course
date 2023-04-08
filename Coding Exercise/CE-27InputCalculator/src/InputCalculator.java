import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        float count = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                float num = scanner.nextInt();
                scanner.nextLine();
                sum += num;
                count++;
            } else {
                scanner.nextLine();
                break;
            }
        }
        int avg = (int) (Math.round(sum / count));
        System.out.println("SUM = " + (int) sum + " AVG = " + avg);
        scanner.close();
    }
}
