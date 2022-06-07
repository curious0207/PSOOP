import java.lang.Math;
class Test{
    double base;
    int power,logBase,argument;
    Test(){
        power=2;
        base=2.0;
        logBase=2;
        argument=2;
    }
    double calculate(double base,int power){
        System.out.println(base+" raised to "+power+" is ");
        return Math.pow(base,power);
    }
    double calculate(int logBase,int argument){
        double num=Math.log(argument);
        double deno=Math.log(logBase);
        System.out.println("log of "+argument+" to the base "+logBase+" is ");
        return num/deno;
    }
}

public class LogandPow
{
	public static void main(String[] args) {
		Test t1=new Test();
		System.out.println(t1.calculate(2.0,4));
		System.out.println(t1.calculate(2,4));
		
	}
}