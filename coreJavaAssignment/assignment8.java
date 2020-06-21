package coreJavaAssignment;

import java.util.Scanner;

public class assignment8 {


    static void color(String x) {

        switch (x) {

            case "R": {
                System.out.println("RED");
                break;
            }
            case "G": {
                System.out.println("GREEN");
                break;
            }
            case "O": {
                System.out.println("ORANGE");
                break;
            }
            case "Y": {
                System.out.println("YELLOW");
                break;
            }
            case "B": {
                System.out.println("BLUE");
                break;
            }
            case "W": {
                System.out.println("WHITE");
                break;
            }
            default: {
                System.out.println("Invalid Code");


            }

        }
    }

    public static void main(String args[]) {
        String x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value");
        x = sc.nextLine();


        color(x);

    }
}
