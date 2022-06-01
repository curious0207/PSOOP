import java.util.Scanner;

class Line{
    int m,c,y1,x0,x1x2,y2;
    Line(int m,int c){
        System.out.println("y="+m+"*x+"+c);
    }
    Line(int y1,int x1,int m){
        System.out.println("y-"+y1+"="+m+"*(x-"+x1+")");
    }
    Line(int y1,int y2,int x1,int x2,int m){
        m=(y2-y1)/(x2-x1);
        System.out.println("(y-"+y1+")/"+(y1-y2)+"="+(m/(x1-x2))+"*(x-"+x1+")");
    }
    
}
public class LineEq
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int c=sc.nextInt();
		Line l1=new Line(m1,c);
        int m2=sc.nextInt();
        int y1=sc.nextInt();
        int x1=sc.nextInt();
		Line l2=new Line(y1,x1,m2);
        int m3=sc.nextInt();
        int y2=sc.nextInt();
        int x2=sc.nextInt();
        Line l3=new Line(y1,y2,x1,x2,m3);
        sc.close();
	}
}