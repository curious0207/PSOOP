import java.util.Scanner;
class Calculate{
    int a1=0,b1=1,c1;
    
    void set(int a,int b,int c){
        a1=b;
        b1=c;
    }
    void fibbo(int n){
        System.out.println(a1);
        System.out.println(b1);
        for(int i=0;i<n-2;i++){
            c1=a1+b1;
            set(a1,b1,c1);
            display();
        }
    }
    void display(){
        System.out.println(c1);
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer to display fibonacci series");
        int n=sc.nextInt();
        Calculate c1=new Calculate();
        c1.fibbo(n);
        sc.close();
    }
    
}
