package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max = 0, min = 0, counter = 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number :");
            boolean isAnInt=scanner.hasNextInt();
            if (!isAnInt) {
                System.out.println("Invalid Number");
                break;
            } else {
                int num = scanner.nextInt();
                if (counter == 1) {
                    min = num;
                    max = num;
                    counter++;
                } else {
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                    counter++;
                }
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Out of "+(counter-1)+" numbers");
        System.out.print("Max = " + max);
        System.out.println();
        System.out.print("Min = " + min);
    }
}
