package coreJavaAssignment;

public class assignment15 {

    static void addNumber(int x) {
        int b = 0;
        int c = String.valueOf(x).length();
        for (int i = 1; i <= c; i++) {
            int a = x % 10;
            b = b + a;
            x = x / 10;
        }
        System.out.println(b);
    }

    public static void main(String args[]) {

        int x = 2324;
        addNumber(x);
    }

}
