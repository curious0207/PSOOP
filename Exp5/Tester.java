import java.util.Scanner;

class Employee{
    private String name,id;
    private int age;
    Employee(String a,String b,int c){
        this.name=a;
        this.id=b;
        this.age=c;
    }
    
    public String getname() { 
		return name; 
	}
    public String getid() { 
		return id; 
	}
    public int getage() {
		return age; 
	}
     
}

class SalariedEmployee extends Employee{
    private double empSalary;
    SalariedEmployee(String a1,String b1,int c1,double empSalary){
        super(a1,b1,c1);
        setter(empSalary);
    }
	void setter(double sa2){
		this.empSalary=sa2;
	}
	public double getsalary() {
		return empSalary; 
	}

}


public class Tester
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nm,id1;
		int a1;
		int n=5;
		SalariedEmployee e1[]=new SalariedEmployee[n];    // object of sub-class (array of objects)
		for(int i=0;i<n;i++){
		    System.out.println("Enter employee name");
		    nm=sc.nextLine();
		    System.out.println("Enter employee ID");
		    id1=sc.nextLine();
		    System.out.println("Enter employee age");
		    a1=sc.nextInt();
		    System.out.println("Enter  1: if he is a permanent employee or 0: if he is on contract");
		    int choice=sc.nextInt();
		    System.out.println("Enter employee salaray");
		    double sa1=sc.nextDouble();
			sc.nextLine();
		    if(choice==1){
		        sa1+=2000;
		    }
		    e1[i]=new SalariedEmployee(nm,id1,a1,sa1);
		}
		
	// maximum salary
		int max=0;
		for(int i=1;i<n;i++){
		    if(e1[i].getsalary()>e1[max].getsalary()){
		        max=i;
		    }
		}
		System.out.println("Employee with highest salary:");
		System.out.println("employee salary " + e1[max].getsalary());
		System.out.println("employee name " + e1[max].getname());
		System.out.println("employee ID " + e1[max].getid());
		System.out.println("employee age " + e1[max].getage());

		sc.close();	
	}
}