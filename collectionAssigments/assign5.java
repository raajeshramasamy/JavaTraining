package collectionAssigments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign5 {

    static class Employee {
        public int id;
        public String name;
        public int salary;
        public String address;

         Employee(int id, String name,int salary, String address) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.address = address;
        }


        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

    public static void main(String args[]) {

        List< Employee > emp = new ArrayList< Employee >();
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee(1,"RAJ",12000,"XXX");
        Employee e2 = new Employee(2,"RAJ1",1200,"XXX");
        Employee e3 = new Employee(3,"RAJ2",120,"XXX");
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        System.out.println("Enter the number Employee ID");
        int a = sc.nextInt();

        //for(int i=0; i<=emp.size(); i++){

           // System.out.println(emp.getId(a));
        System.out.println(emp.get(a).getId());
        System.out.println(emp.get(a).getSalary());
        System.out.println(emp.get(a).getAddress());
        System.out.println(emp.get(a).getSalary());

        //}
    }
}
