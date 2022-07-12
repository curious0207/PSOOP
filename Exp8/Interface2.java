import java.util.*;
interface SavingAccount{
    public void getSimpleInterest();
}
interface CurrentAccount{
    public void getCompoundInterest();
}
class Customer implements SavingAccount,CurrentAccount{
    String acc1="Saving";
    String acc2="Current";
    String acc;
    int p,t;
    float r;
    Customer(int p,float r,int t,String acc){
        this.p=p;
        this.r=r;
        this.t=t;
        this.acc=acc;
    }
    
    public void getSimpleInterest(){
        if(acc.compareTo(acc1)==0){
            double sint=p*(r*t);
            System.out.println("Interest on balance " +sint);
        } 
    }
    public void getCompoundInterest(){
        if(acc.compareTo(acc2)==0){
            double cint=p*Math.pow(1+(r/100),t)-p;
            System.out.println("Interset on balance "+cint);
        }
    }
}
public class Interface2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter balance amount");
	    int p=sc.nextInt();
        System.out.println("Enter interest rate");
	    float r=sc.nextFloat();
        System.out.println("Enter time period");
	    int t=sc.nextInt();
        System.out.println("Enter account type:Saving or Current");
	    String acc=sc.next();
		Customer c1=new Customer(p,r,t,acc);
		c1.getSimpleInterest();
		c1.getCompoundInterest();
        sc.close();
	}
}