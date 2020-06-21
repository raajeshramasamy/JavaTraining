package coreJavaAssignment;

public class assignment1 {
    static void positiveNegative(int i) {
        if (i > 0) {
            System.out.println("Positive Number");
        } else if (i < 0) {
            System.out.println("Negative Number");
        } else if (i == 0) {
            System.out.println("Zero");
        }
    }

    public static void main(String args[]) {


        int i = 2;
        positiveNegative(2);

    }


}
