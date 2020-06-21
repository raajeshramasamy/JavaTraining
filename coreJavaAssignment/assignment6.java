package coreJavaAssignment;

public class assignment6 {

    public static void main(String args[]) {
        args = new String[2];
        //System.out.println("Enter Male or Female: "+args[0]);
        //System.out.println("Enter Age b/w 1 - 120: "+args[1]);
        args[0]= "MALE";
        args[1]="56";
        String s = args[0].toString().toUpperCase();
        int age = Integer.parseInt(args[1]);
      if(s=="FEMALE" ) {
          if (age>=1 || age <=58)
              System.out.println("Percentage 8.2%");
          else if (age>59 || age >=120 )
              System.out.println("Percentage 7.6%");
      }
      else if(s=="MALE" ){
            if (age>=1 || age <=58)
                System.out.println("Percentage 9.2%");
            else if (age>59 || age >=120 )
                System.out.println("Percentage 8.3%");

        }

    }
}

