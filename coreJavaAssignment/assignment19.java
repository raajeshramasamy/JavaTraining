package coreJavaAssignment;

public class assignment19 {

    static void divsibleby5() {
        int c = 1;
        int i = 1;
        while(c <= 5)
        {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                i++;
                c++;
            } else {
                i++;
            }
        }
    }
    public static void main(String args[]  ) {
        divsibleby5();
    }
}
