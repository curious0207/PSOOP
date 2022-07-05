import java.util.*;

abstract class Course{
    abstract void studentDetails();
}
class Comps extends Course{
    String nm,roll,yr;
    Comps(String nm,String roll,String yr){
        this.nm=nm;
        this.roll=roll;
        this.yr=yr;
    }
    
    void studentDetails(){
        
    }
}
class IT extends Course{
    String nm,roll,yr;
    IT(String nm,String roll,String yr){
        this.nm=nm;
        this.roll=roll;
        this.yr=yr;
    }
    void studentDetails(){
       
    }
}

public class CourseDetails
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		String name,UID,year;
        System.out.println("Enter 'C' if student is of course Comps or 'I' if course IT");
        char ch=sc.next().charAt(0);
		
        if(ch=='C'){
            Comps c1[]=new Comps[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter name of the student");
                sc.nextLine();
                name=sc.nextLine();
                
                System.out.println("Enter the UID");
                UID=sc.nextLine();
                System.out.println("Enter the year:FE,SE OR TE");
                year=sc.next();
                c1[i]=new Comps(name,UID,year);
            }
            for(int i=0;i<n;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if(c1[min].yr.compareTo(c1[j].yr)<0){
                        min=j;
                    }
                }
                String temp=c1[i].yr;
                c1[i].yr=c1[min].yr;
                c1[min].yr=temp;
            }
            System.out.println("Details in sorted manner");
            for(int i=0;i<n;i++){
                System.out.println(c1[i].nm+" "+c1[i].roll+" "+c1[i].yr); 
            }
        }
        else{
            IT t1[]=new IT[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter name of the student");
                name=sc.nextLine();
                System.out.println("Enter the UID");
                UID=sc.nextLine();
                sc.nextLine();
                System.out.println("Enter the year:FE,SE OR TE");
                year=sc.nextLine();
                t1[i]=new IT(name,UID,year);
            }
            for(int i=0;i<n;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if(t1[min].yr.compareTo(t1[j].yr)<0){
                        min=j;
                    }
                }
                String temp=t1[i].yr;
                t1[i].yr=t1[min].yr;
                t1[min].yr=temp;
            }
            System.out.println("Details in sorted manner");
            for(int i=0;i<n;i++){
                System.out.println(t1[i].nm+" "+t1[i].roll+" "+t1[i].yr); 
            }
        }
        sc.close();
	}
}