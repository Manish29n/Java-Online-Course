public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digit, temp = reverse(number);
            int revnumber = reverse(number);
            if (revnumber != 0) {
                while (revnumber != 0) {
                    digit = revnumber % 10;
                    switch (digit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                    revnumber /= 10;
                }
                int sub = getDigitCount(number) - getDigitCount(temp);
                if (sub > 0) {
                    int i = 0;
                    do {
                        i++;
                        System.out.println("Zero");
                    } while (i < sub);
                }
            } else {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int rev = 0, digit;
        while (number != 0) {
            digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        return rev;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int count = 0;
            while (number != 0) {
                count++;
                number /= 10;
            }
            return count;
        }
    }
}
