import java.util.Scanner;
class Posting{
    int cW,ApTest,Techtest,interview;
    int count;
    Posting(int cW,int ApTest,int Techtest,int interview){
        this.cW=cW;
        this.ApTest=ApTest;
        this.Techtest=Techtest;
        this.interview=interview;
        int sum=cW+ApTest+Techtest+interview;
        count=1;
        display(sum);
    }
    Posting(int Techtest,int interview){
        this.Techtest=Techtest;
        this.interview=interview;
        int sum=Techtest+interview;
        count=2;
        display(sum);
    }
    Posting(int interview){
        this.interview=interview;
        count=3;
        display(interview);
    }
    void display(int d){
        if(count==1){
            if(d>=80){
                System.out.println("Selected");
            }
            else{
                System.out.println("Try next time,not Selected");
            }
        }
        else if(count==2){
            if(d>=85){
                System.out.println("Selected");
            }
            else{
                System.out.println("Try next time,not Selected");
            }
        }
        if(count==3){
            if(d>=90){
                System.out.println("Selected");
            }
            else{
                System.out.println("Try next time,not Selected");
            }
        }
    }
}
public class EmployeeRecruit
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Which post do you want to recruit the employee for:\n1.for programmer, 2.for Team Leader, 3.for project manager");
		int choice=sc.nextInt();
		switch (choice) {
		    case 1:
		        int cw=sc.nextInt();
		        int aptest=sc.nextInt();
		        int tt=sc.nextInt();
		        int interview=sc.nextInt();
		        Posting p1=new Posting(cw,aptest,tt,interview);
		        break;
		   case 2:
		        tt=sc.nextInt();
		        interview=sc.nextInt();
		        Posting p2=new Posting(tt,interview);
		        break;
		   case 3:
		        interview=sc.nextInt();
		        Posting p3=new Posting(interview);
		        break;      
		}
        sc.close();
	}
}