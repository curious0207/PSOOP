import java.util.Scanner;

class Line{
    int m,c,y1,x0,x1,x2,y2;
    Line(int m,int c){
        System.out.println("Equation of line in slope - y intercept form:");
        System.out.println("y="+m+"*x+"+c);
    }
    Line(int y1,int x1,int m){
        System.out.println("Equation of line in slope-point form:");
        System.out.println("y-"+y1+"="+m+"*(x-"+x1+")");
    }
    Line(int y1,int y2,int x1,int x2){
        System.out.println("Equation of line in Two-point form:");
        int num=(y2-y1);
        int deno=(x2-x1);
        System.out.println("(y-"+y1+")/("+(y1-y2)+") = "+num+"*(x-"+x1+")/"+(deno*(x1-x2)));
    }
    
}
public class LineEq
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter slope of the line");
        int m1=sc.nextInt();
        System.out.println("Enter y-intercept");
        int c=sc.nextInt();
		Line l1=new Line(m1,c);
        System.out.println("Enter slope of line");
        int m2=sc.nextInt();
        System.out.println("Enter y and x co-ordinate of a point on the line");
        int y1=sc.nextInt();
        int x1=sc.nextInt();
		Line l2=new Line(y1,x1,m2);
        System.out.println("Enter y and x co-ordinate of another point on the line");
        int y2=sc.nextInt();
        int x2=sc.nextInt();
        Line l3=new Line(y1,y2,x1,x2);
        sc.close();
	}
}