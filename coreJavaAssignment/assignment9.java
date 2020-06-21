package coreJavaAssignment;

import java.util.Scanner;

public class assignment9 {

    static void month(int x) {

        switch (x) {

            case 1: {
                System.out.println("January");
                break;
            }
            case 2: {
                System.out.println("Febuary");
                break;
            }
            case 3: {
                System.out.println("March");
                break;
            }
            case 4: {
                System.out.println("April");
                break;
            }
            case 5: {
                System.out.println("May");
                break;
            }
            case 6: {
                System.out.println("June");
                break;
            }
            default: {
                System.out.println("Not Valid");


            }

        }
    }

    public static void main(String args[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value b/w 1 - 12");
        x = Integer.parseInt(sc.nextLine());
        month(x);

    }
}


