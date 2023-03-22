package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte b=10;
        short s=20;
        int i=50;
        long longTotal=(long)(50000+(10*(b+s+i)));
        System.out.println("The Answer is "+longTotal);

        short shortTotal=(short)(1000+10*(b+s+i));
        System.out.println("The Answer is "+shortTotal);
    }
}
