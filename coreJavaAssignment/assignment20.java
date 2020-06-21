package coreJavaAssignment;

import java.util.Scanner;

public class assignment20 {

    static void addSub() {

        String ss;
        do {
            System.out.println("Enter the option 1(Add) or 2(Sub)");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            System.out.println("Enter the Number:");
            Scanner a = new Scanner(System.in);
            int s = a.nextInt();

            System.out.println("Enter the Number:");
            Scanner b = new Scanner(System.in);
            int r = b.nextInt();
            if (x == 1) {
                System.out.println("Addition Result: " + (s + r));
            } else
                System.out.println("Subraction Result: " + (s - r));
            System.out.println("Do you want to Cont..Y/N");
            Scanner v = new Scanner(System.in);
             ss = a.next();
        }
        while(ss.equals("Y") || ss.equals("y"));
            System.out.println(ss=="Y");
        System.out.println(ss=="y");
        }




    public static void main(String args[]){
        addSub();
    }
}
