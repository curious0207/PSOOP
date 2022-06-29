import java.util.*;

class Employee{
    int salary;
    Employee(){
        this.salary=10000;
    }
    int getsalary(){
        return 10000;   // base salary
    }
    int getBonus(){
        return 0;
    }
}
class Intern extends Employee{
    int getsalary(){
        return 3*salary/4;
    }
    int getBonus(){
        return 1000;
    }
}
class Clerk extends Employee{
    int getsalary(){
        return salary/2;
    }
    int getBonus(){
        return 500;
    }
}
class Manager extends Employee{
    int getsalary(){
        return 2*salary;
    }
    int getBonus(){
        return 2000;
    }
}
public class SalaryPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        Intern i1=new Intern();
        System.out.println("Salary of intern "+ i1.getsalary());
        Clerk c1=new Clerk();
        System.out.println("Salary of clerk "+ c1.getsalary());
        Manager m1=new Manager();
        System.out.println("Salary of manager "+ m1.getsalary());
        sc.close();

    }
    
}
