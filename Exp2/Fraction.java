import java.util.Scanner;

class fractionCal{
    int a,b,c,d;
    int num,deno;
    
    int gcd(int n,int d){
        if(n==0){
            return d;
        }
        return gcd(n%d,n);
    }
    fractionCal(){
        a=1;
        b=1;
        c=1;
        d=1;
    }
    void display(int nu,int de){
        System.out.println(nu+"/"+de);
    }
    void addition(int a,int b,int c,int d){
        num=(a*d+b*c);
        deno=b*d;
        int g=gcd(num,deno);
        num/=g;
        deno/=g;
        display(num,deno);
    }
    void subtraction(int a,int b,int c,int d){
        num=(a*d-b*c);
        deno=b*d;
        int g=gcd(num,deno);
        num/=g;
        deno/=g;
        display(num,deno);
    }
    void multiplication(int a,int b,int c,int d){
        num=(a*c);
        deno=b*d;
        int g=gcd(num,deno);
        num/=g;
        deno/=g;
        display(num,deno);
    }
    void division(int a,int b,int c,int d){
        num=(a*d);
        deno=b*c;
        int g=gcd(num,deno);
        num/=g;
        deno/=g;
        display(num,deno);
    }
}
public class Fraction {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator of first fraction");
        int a=sc.nextInt();
        System.out.println("Enter denominator of first fraction");
        int b=sc.nextInt();
        System.out.println("Enter numerator of second fraction");
        int c=sc.nextInt();
        System.out.println("Enter denominator of second fraction");
        int d=sc.nextInt();
        fractionCal f1=new fractionCal();
        System.out.println("Enter 1:to perform addition, 2: to perform subtarction, 3: to perform multiplication, 4: to perform division");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            f1.addition(a,b,c,d);
            break;
            case 2:
            f1.subtraction(a,b,c,d);
            break;
            case 3:
            f1.multiplication(a,b,c,d);
            break;
            case 4:
            f1.division(a,b,c,d);
            break;
        }
        sc.close();
    }
}
