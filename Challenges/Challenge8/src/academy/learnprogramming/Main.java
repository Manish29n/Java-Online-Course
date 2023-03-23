package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=1,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Numbers :");
        while(i<=10){
            System.out.print("Enter number #"+i+" :");
            boolean hasNextInt= scanner.hasNextInt();
            if(hasNextInt){
                int num=scanner.nextInt();
                sum += num;
                i++;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum of these "+(i-1)+" Numbers are :"+sum);
    }
}
