package coreJavaAssignment;

import java.util.Scanner;

public class assignment16 {

    static void floyd(int x){
        for (int i=1; i<=x; i++){
            for(int j=1 ; j<=i;j++){
               System.out.print("*"+" ");
            }
           System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        floyd(sc.nextInt());
    }
}
