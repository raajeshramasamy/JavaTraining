package coreJavaAssignment;

import java.util.Scanner;

public class assignment12 {

    static void primeNumber(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("Its a prime number");
        } else
            System.out.println("Its not a prime number");
    }


    public static void main(String args[]) {
        System.out.println("Enter a number ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        primeNumber(i);
    }
}
