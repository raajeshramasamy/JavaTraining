package collectionAssigments;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign1 {
    static List evenNumber1 = new ArrayList();

    public static ArrayList evenNumber(int n) {
        for (int i = 1; i <= n; i++) {
           if (i % 2 == 0) {
                evenNumber1.add(i);
           }
           else
               evenNumber1.add(0);
        }
        System.out.println("Exit for loop");
        return (ArrayList) evenNumber1;
    }
    public  static void printEvenNumber(){

            int a = evenNumber1.size();
            System.out.println("value a  :"+a);
           for (int i=0; i<=a-1; i++){
               int b = (int) evenNumber1.get(i);
            System.out.print(b*2+" ");
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the N number to find even:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenNumber(n);
        printEvenNumber();
        System.out.println("Enter the number to find:");
        Scanner sb = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(assign1.evenNumber1.get(y));
    }
}
