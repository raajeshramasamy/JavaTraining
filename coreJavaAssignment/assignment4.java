package coreJavaAssignment;

public class assignment4 {

    static void order(String a, String b) {

        if (a.compareTo(b) <= 0) {
            System.out.println(a + "," + b);

        } else {
            System.out.println(b + "," + a);
        }
    }

    public static void main(String args[]) {

        String a = "aa";
        String b = "ae";
        order(a, b);

    }

}
