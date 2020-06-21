package coreJavaAssignment;

import java.util.Scanner;

public class assignment18 {


    static void palindrome(int c) {
        int b = 0;
        int a = c;
        while (c>0) {
            b = b * 10;
            b = b + c%10;
            c = c/10;
        }
        System.out.println(a==b);

        if (a==b) {
            System.out.println("The given number is palindrome");
        } else {
            System.out.println("The given number is not palindrome");
        }
    }

    public static void main(String args[]) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        palindrome(sc.nextInt());
    }


}
