package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of 128 is "+ sumDigits(128));
        System.out.println("The sum of 128345 is "+ sumDigits(128345));
        System.out.println("The sum of -128 is "+ sumDigits(-128));
        System.out.println("The sum of 1 is "+ sumDigits(1));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        } else {
            int digits, sum = 0;
            while (number != 0) {
                digits = number % 10;
                sum += digits;
                number /= 10;
            }
            return sum;
        }
    }
}
