package coreJavaAssignment;

public class assignment2 {

    static void oddEven(int i) {

        if (i % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        System.out.println(i % 2);
    }

    public static void main(String args[]) {

        int i = 4;
        oddEven(i);
    }

}
