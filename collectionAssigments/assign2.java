package collectionAssigments;

import java.util.*;

public class assign2 {

    static List< assign2 > emp = new ArrayList< assign2 >();

    int empID;

    public int getEmpID(int i) {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    String name;
    String email;
    char gen;

   /* public assign2(int empID, String name,String email,char gen){
        this.empID = empID;
        this.name = name;
        this.email = email;
        this.gen = gen;

    }*/

    static void addEmployeeDetails() {
        assign2 empDet = new assign2();
        Scanner sc = new Scanner( System.in );

        System.out.println( "Enter the ID" );
        empDet.setEmpID( sc.nextInt() );

        System.out.println( "Enter the name" );
        empDet.setName( sc.next() );

        System.out.println( "Enter the Email" );
        empDet.setEmail( sc.next() );

        //System.out.println( "Enter the Gender as M/F" );
       // empDet.setGen( (char) sc.nextByte() );

        emp.add( empDet );
System.out.println("End Of Loop");
    }

    static void printEmpDetails()

    {
        Iterator it = emp.iterator();
        while(it.hasNext()){
            System.out.println(emp.getClass().getName());
        }
    }
        public static void main (String args[])
        {
        addEmployeeDetails();
        printEmpDetails();

    }



}


