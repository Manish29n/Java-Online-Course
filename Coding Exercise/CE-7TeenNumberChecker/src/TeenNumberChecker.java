public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three) {
        return ((one > 12 && one < 20) || (two > 12 && two < 20) || (three > 12 && three < 20));
    }
    public static boolean isTeen(int num){
        return((num > 12 && num < 20));
    }
}
