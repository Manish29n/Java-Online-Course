package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double n1=20,n2=80;
        double n3=(n1+n2)*100;
        System.out.println("Total is "+n3);
        double rem=n3%40;
        System.out.println("Remainder is "+rem);
        boolean answer=(rem==0)?true:false;
        System.out.println("Answer is "+answer);
        if(answer){
            System.out.println("Got no Reminder");
        }
        else{
            System.out.println("Got some Remainder");
        }

    }
}
