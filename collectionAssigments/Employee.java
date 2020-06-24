package collectionAssigments;


import java.util.*;

public  class Employee implements Comparable{

    static Employee emp;
    static Employee emp1;

    static   List<Employee> EmployeeDb = new ArrayList<Employee>();
    static TreeSet< Employee > EmpDb = new TreeSet<Employee>();
     int empID;

    public int getEmpID() {
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    String name;
    String email;
    float salary;
    char gen;

  /*  public Employee(int empID,
                    String name,
                    String email,
                    float salary,
                    char gen){

        this.empID = empID;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.gen = gen;} */

      static void setEmployeeDetails(int n) {
          for(int i =1 ; i<=n ; i++) {
              emp = new Employee();
              Scanner sc = new Scanner( System.in );
              System.out.println("Enter Employee ID");
              emp.setEmpID( sc.nextInt() );
              System.out.println("Enter Employee name");
              emp.setEmail( sc.next() );
              System.out.println("Enter Employee email");
              emp.setName( sc.next() );
              System.out.println("Enter Employee salary");
              emp.setSalary( sc.nextFloat() );
              System.out.println("Enter Employee gender");
              char c = sc.next().charAt( 0 );
              emp.setGen(c );
              EmployeeDb.add( emp );
              System.out.println("Added Employee Details"+ i);
          }
    }

    static void setEmployeeDetailsTree(int n) {
        for(int i =1 ; i<=n ; i++) {
            emp1 = new Employee();
            Scanner sc = new Scanner( System.in );
            System.out.println("Enter Employee ID");
            emp1.setEmpID( sc.nextInt() );
            System.out.println("Enter Employee name");
            emp1.setEmail( sc.next() );
            System.out.println("Enter Employee email");
            emp1.setName( sc.next() );
            System.out.println("Enter Employee salary");
            emp1.setSalary( sc.nextFloat() );
            System.out.println("Enter Employee gender");
            char c = sc.next().charAt( 0 );
            emp1.setGen(c );
            EmpDb.add( emp1 );
            System.out.println("Added Employee Details"+ i);
        }
    }

      static void getEmployeeDetails(int n ) {
          System.out.println("Entered id  :" +n);

        Iterator<Employee> itr = EmployeeDb.iterator();
        if(itr.hasNext())
            System.out.println("Inside if loop");
            for(int i=0; i<=n ;i++) {
                System.out.println("Inside for loop");
               System.out.println("Employee"+EmployeeDb.get(i).getEmpID());
                if (EmployeeDb.get(i).getEmpID() == n) {
                    System.out.println("Inside for2 loop");
                    System.out.println( EmployeeDb.get( i ).getEmpID() );
                    System.out.println( EmployeeDb.get( i).getName() );
                    System.out.println( EmployeeDb.get( i).getEmail() );
                    System.out.println( EmployeeDb.get(i ).getSalary() );
                    System.out.println( EmployeeDb.get( i).getGen() );
               }
            }
    }

    static void getEmployeeDetailsTree() {

       Iterator itr = EmpDb.iterator();
            System.out.println( "Set    :" + EmpDb);

    }

    public static void main(String[] args) {
        //Employee e1 = new Employee(1, "RR", "raj@gmail.com",1200,'M' );
        // Employee e2 = new  Employee(2, "RR", "ra@gmail.com",1300,'F' );
        //EmployeeDb.add(e1);
        //EmployeeDb.add(e2);
        /*Scanner sss = new Scanner(System.in);
        System.out.println("Enter the number of employees to add: ");
        int a = sss.nextInt();
        System.out.println(a);
        setEmployeeDetails(a);
        System.out.println("Enter the ID to search: ");
        int b= sss.nextInt();
        getEmployeeDetails(b); */
            setEmployeeDetailsTree(1);
        getEmployeeDetailsTree();


    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

