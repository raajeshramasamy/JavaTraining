package collectionAssigments;

import java.util.Enumeration;
import java.util.Vector;

public class assign8 {

    public static void main(String args[]){

        Vector vc = new Vector();
        vc.add("Hello");
        vc.add("Java");
        vc.add("1.9");

        Enumeration num = vc.elements();

        while (num.hasMoreElements()){
            System.out.println(num.nextElement());
        }

    }
}
