public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one,double two){
        double test1= one*1000;
        double test2= two*1000;
        return (int) test1 == (int) test2;
    }
}
