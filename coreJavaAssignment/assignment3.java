package coreJavaAssignment;

public class assignment3 {

    public static void main(String args[]) {

        args = new String[2];
        args[0] = "Chennai";
        args[1] = "Bangalore";

        if (args.length == 0) {
            System.out.println("No Values");
        }
        for (int i = 0; i < args.length; i++) {
            //  for (String i : args)     //for each value in args store in i
            System.out.print(args[i] + " , ");
        }
    }
}
