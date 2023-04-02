public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int rev=0,digit,temp=number;
        while(number!=0){
            digit=number%10;
            rev=rev*10+digit;
            number /=10;
        }
        return (rev==temp);
    }
}
