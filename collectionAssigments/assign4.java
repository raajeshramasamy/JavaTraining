package collectionAssigments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign4 {

    static List<Integer> list = new ArrayList<Integer>();
    static int a;

    static void addInteger() {
        System.out.println("Enter the Number of values");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the Integer , Double or Float values");
        try {
            for (int i = 1; i <= a; i++) {

                Scanner scc = new Scanner(System.in);
                if (Integer.class.isInstance(scc.nextInt())) {
                    System.out.println("Integer");
                    list.add(i);
                } else if (Float.class.isInstance(scc.nextFloat())) {
                    System.out.println("Float");
                    list.add(i);
                }
                else if (Double.class.isInstance(scc.nextDouble())) {
                    System.out.println("Double");
                    list.add(i);
                }
                else if (Long.class.isInstance(scc.nextLong())) {
                    System.out.println("Long");
                    list.add(i);
                }
                else {
                    System.out.println("other");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        static void printValues () {
            for (int i = 0; i < assign4.a; i++) {
                System.out.print(" " + list.get(i));
            }
        }


    public static void main(String args[]) {
        addInteger();
        printValues();
    }

}
