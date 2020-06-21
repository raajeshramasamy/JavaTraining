package collectionAssigments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class assign3 {
    static List<String> list = new ArrayList<String>();
    static int a;
    static void addArray() {
        System.out.println("Enter the String cont");
        Scanner sc = new Scanner(System.in);
        String str = new String();
         a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("Enter the values");
            Scanner scc = new Scanner(System.in);
            str = sc.next();
            list.add(str);
        }
    }

static void printArray(){

    Iterator iterator = list.iterator();
    System.out.println("List elements : ");
    while (iterator.hasNext())
        System.out.println(iterator.next() + " ");
}
    public static void main(String args[]) {
        addArray();
        printArray();
    }

}