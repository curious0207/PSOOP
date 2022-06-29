import java.util.*;
class Bank{
    double r;
    void get_rate_of_interest(int am,int d){
        System.out.println("rate is 2");
    }
}
class SBI_Bank extends Bank{
    
    void get_rate_of_interest(int am,int d){
        if(7<=d&&d<=14){
            r=3;
        }
        else if(15<=d&&d<=30){
            r=3;
        }
        else if(31<=d&&d<=45){
            r=3;
        }
        else if(46<=d&&d<=90){
            r=4.05;
        }
        else if(91<=d&&d<=120){
            r=4.1;
        }
        else if(121<=d&&d<=180){
            r=4.1;
        }
        CompInt(am,r,d);
        
    }
    void CompInt(int am,double r,int t){
        double time=(double)t/365;
        double amount=am*Math.pow((1+r/100),time);
        System.out.printf("Final amount from SBI is %.2f\n",amount);
    }
    
}
class ICICI_Bank extends Bank{
    void get_rate_of_interest(int am,int d){
        if(7<=d&&d<=14){
            r=3.10;
        }
        else if(15<=d&&d<=30){
            r=3.2;
        }
        else if(31<=d&&d<=45){
            r=3.5;
        }
        else if(46<=d&&d<=90){
            r=4.5;
        }
        else if(91<=d&&d<=120){
            r=4.7;
        }
        else if(121<=d&&d<=180){
            r=4.9;
        }
        CompInt(am,r,d);
        
    }
    void CompInt(int am,double r,int t){
        double time=(double)t/365;
        double amount=am*Math.pow((1+r/100),time);
        System.out.printf("Final amount from ICICI Bank is %.2f\n",amount);
    }
}
class AXIS_Bank extends Bank{
    void get_rate_of_interest(int am,int d){
        if(7<=d&&d<=14){
            r=3.15;
        }
        else if(15<=d&&d<=30){
            r=3.15;
        }
        else if(31<=d&&d<=45){
            r=3.45;
        }
        else if(46<=d&&d<=90){
            r=4.05;
        }
        else if(91<=d&&d<=120){
            r=4.7;
        }
        else if(121<=d&&d<=180){
            r=5;
        }
        CompInt(am,r,d);
        
    }
    void CompInt(int am,double r,int t){
        double time=(double)t/365;
        double amount=am*Math.pow((1+r/100),time);
        System.out.printf("Final amount from AXIS bank is %.2f\n",amount);
    }
}
public class BankInterest
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of days");
	    int days=sc.nextInt();
	    System.out.println("Enter number of amount to be deposited");
	    int am=sc.nextInt();
	    
	    SBI_Bank s1=new SBI_Bank();
	    s1.get_rate_of_interest(am,days);
	    
	    ICICI_Bank s2=new ICICI_Bank();
	    s2.get_rate_of_interest(am,days);
	    AXIS_Bank s3=new AXIS_Bank();
	    s3.get_rate_of_interest(am,days);
	    
	    System.out.print("Maturity Date: ");
	    Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, days);
        System.out.println(calendar.getTime());
        //System.out.println(calendar.get(Calendar.DATE));
        sc.close();
	}
}