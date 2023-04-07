public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            int prime = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    boolean isPrime = true;
                    for (int j = 2; j <= (long) Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        prime = i;
                    }
                }
            }
            return prime;
        }
    }
}
