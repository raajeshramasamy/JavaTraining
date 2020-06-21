package coreJavaAssignment;

public class assignment5 {

    static void alphabetNumberSpecial(char a) {

        if (a >= 65 && a <= 122)
            System.out.println("Alphabet");
        else if (a >= 48 && a <= 57) {
            System.out.println("Number");
        } else
            System.out.println("Special Character");
    }

    public static void main(String args[]) {
        char a = '0';
        alphabetNumberSpecial(a);

    }
}

