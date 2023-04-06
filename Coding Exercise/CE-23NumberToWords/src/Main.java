public class Main {
    public static void main(String[] args) {
        System.out.println(NumberToWords.reverse(123));
        System.out.println(NumberToWords.reverse(453));
        System.out.println(NumberToWords.reverse(-891));
        System.out.println(NumberToWords.reverse(0));
        System.out.println(NumberToWords.reverse(1450));
        NumberToWords.numberToWords(453);
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(0);
        NumberToWords.numberToWords(241);
        NumberToWords.numberToWords(1450);
        System.out.println(NumberToWords.getDigitCount(1450));
    }
}
