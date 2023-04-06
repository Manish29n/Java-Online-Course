public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int total = smallCount + (bigCount * 5);
        if (bigCount * 5 > goal && goal % 5 > smallCount) {
            return false;
        }
        return goal <= total;
    }
}
