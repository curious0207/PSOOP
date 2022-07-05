import java.util.*;
abstract class AmusementPark{
    abstract void getcost(int a,int arr[]);
}
class Esselworld extends AmusementPark{
    Scanner sc=new Scanner(System.in);
    int fee;
    void getcost(int a,int game[]){
        if(a>21 && a<60){
            this.fee=1050;
        }
        else{
            this.fee=660;
        }
        
    for(int i=0;i<15;i++){
        System.out.println("Enter 1 if you played game no. "+(i+1));
        int ch=sc.nextInt();
        if(ch==1){
            game[i]=11;
            if(i>=7){
                this.fee+=50;
            }
        }
    }
    
    }
}
class Imagica extends AmusementPark{
    Scanner sc=new Scanner(System.in);
    int fee,count=0;
    void getcost(int a,int game[]){
        if(a>21 && a<60){
            this.fee=1500;
        }
        else{
            this.fee=1100;
        }
        
    for(int i=0;i<20;i++){
        System.out.println("Enter 1 if you played game no. "+(i+1));
        int ch=sc.nextInt();
        if(ch==1){
            count++;
            game[i]=11;
            if(i>=7){
                this.fee+=50;
            }
        }
    }
    
    }
    
}
public class WaterPark
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter total people in the group");
	    int n=sc.nextInt();
	    System.out.println("Enter 1 to go to imagica or 0 to go to Esselworld");
	    int choice=sc.nextInt();
        System.out.println("Enter 1 if it is weekend or 0 if it is a weekday");
        int day=sc.nextInt();
        int games[]=new int[20];
		if(choice==1){
            Imagica im[]=new Imagica[n];
            int totalcost=0;
	    	for(int i=0;i<n;i++){
                System.out.println("enter age of person "+(i+1));
                int age=sc.nextInt();
                im[i]=new Imagica();
                im[i].getcost(age,games);
                if(day==1){
                    im[i].fee+=300;
                }
                System.out.println("Cost of person "+ (i+1)+ " is " + im[i].fee);
                System.out.println("Total games played by person "+ (i+1)+ " is " + im[i].count);
                totalcost+=im[i].fee;
                
            }
            System.out.println("Total cost "+totalcost);
		}
        else{
            Esselworld es[]=new Esselworld[n];
            //int games[]=new int[20];
            int totalcost=0;
	    	for(int i=0;i<n;i++){
                System.out.println("enter age of person "+(i+1));
                int age=sc.nextInt();
                es[i]=new Esselworld();
                es[i].getcost(age,games);
                totalcost+=es[i].fee;
            }
            System.out.println("Total cost "+totalcost);
        }
        
		sc.close();   
	}
}