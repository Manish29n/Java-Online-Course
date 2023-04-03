public class SharedDigit {

    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1 >= 10 && n1 <= 99 && n2 >= 10 && n2 <= 99) {
            int n1digit1, n2digit1;
            n1digit1 = n1 % 10;
            n1 /= 10;
            n2digit1 = n2 % 10;
            n2 /= 10;
            return (n1digit1 == n2digit1 || n1digit1 == n2 || n1 == n2digit1 || n1 == n2);
        } else {
            return false;
        }
    }
}
