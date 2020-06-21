package coreJavaAssignment;

import static java.lang.Character.isLowerCase;

public class assignment7 {


    static void lowerToUpper(char x) {
        if (isLowerCase(x)) {
            System.out.println("Lower");
            System.out.println(x + "," + Character.toUpperCase(x));
        } else {
            System.out.println("Upper");
            System.out.println(x + "," + Character.toLowerCase(x));
        }

    }

    public static void main(String args[]) {
        char x = 'B';
        lowerToUpper(x);
    }
}
