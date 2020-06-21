package coreJavaAssignment;

public class assignment17 {


    static void reverse(int c) {
        int b = 0;
        while (c>0) {
            b = b * 10;
            b = b + c%10;
            c = c/10;
        }
        System.out.println(b);
    }

    public static void main(String args[]) {

        int x = 112211;
        reverse(x);
    }
}
