import java.util.*;

class Invalid extends Exception
{  
    public void msg(){
        System.out.println("distance is not valid you are early for vaccination");
    }
}
class ExceedD extends Exception
{  
    public void msg2(){
        System.out.println("distance is not valid it is eceed more than 100 days");
    }
}
class NegativeD extends Exception
{  
    public void msg1(){
        System.out.println("distance is not valid it cannot be negative");
    }
}
public class excp2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance");
        int d=sc.nextInt();
		try{
		    if(d<84&&d>0){
		       throw new Invalid();  
		    }
            else if(d>100){
                throw new ExceedD();
            }
            else if(d<0){
                throw new NegativeD();
            }
		    else {   
                System.out.println("welcome for vaccination");
            }   
		}
		catch (Invalid e)  
        {  
           e.msg(); 
        }
        catch(NegativeD e1){
            e1.msg1();
        }
        catch(ExceedD e2){
            e2.msg2();
        }
        
	}
}