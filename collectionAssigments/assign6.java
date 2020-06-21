package collectionAssigments;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class assign6 {

    static List evenNumber1 = new LinkedList();

    public static LinkedList evenNumber(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenNumber1.add(i);
            }
            else
                evenNumber1.add(0);
        }
        System.out.println("Exit for loop");
        return (LinkedList) evenNumber1;
    }
    public  static void printEvenNumber(){

        int a = evenNumber1.size();
        for (int i=1; i<=a-1; i++){
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
        System.out.println(evenNumber1.size());
        System.out.println(evenNumber1.get(y));
    }
}
