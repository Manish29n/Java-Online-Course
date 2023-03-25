public class Main {
    public static void main(String[] args) {
        boolean result;
        System.out.println(result = BarkingDog.shouldWakeUp(true, 7));
        System.out.println(result = BarkingDog.shouldWakeUp(false, 2));
        System.out.println(result = BarkingDog.shouldWakeUp(true, 24));
        System.out.println(result = BarkingDog.shouldWakeUp(true, 9));
    }
}
