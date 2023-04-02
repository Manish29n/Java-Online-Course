public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum;
            sum = (number % 10);
            while (number >= 10) {
                number /= 10;
            }
            sum += number;
            return sum;
        }
    }
}
