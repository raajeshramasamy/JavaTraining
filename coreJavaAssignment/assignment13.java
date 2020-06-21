package coreJavaAssignment;

public class assignment13 {

    static void primeNumber() {
        int count = 0;
        for (int i = 10; i <= 90; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i + "  is a prime number");
            }
        }
    }


    public static void main(String args[]) {

        primeNumber();
    }
}
