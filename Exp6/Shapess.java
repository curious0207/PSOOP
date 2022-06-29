import java.util.*;

class Shape{
    
    double getArea(){
        return 0;
    }
    double getPerimeter(){
        return 0;
    }
    double getSide(){
        return 0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    double getArea(){
        double a=Math.PI*radius*radius;
        return a;
    }
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    double getSide(){
        return radius;
    }
}
class Triangle extends Shape{
    double side;
    Triangle(double s){
        this.side=s;
    }
    double getArea(){
        double a=Math.sqrt(3)*(side*side)/4;
        return a;
    }
    double getPerimeter(){
        return 3*side;
    }
    double getSide(){
        return side;
    }
}
class Pentagon extends Shape{
    double side;
    Pentagon(double s){
        this.side=s;
    }
    double getArea(){
        double a=Math.sqrt(5*(5+2*Math.sqrt(5)))*side*side/4;
        return a;
    }
    double getPerimeter(){
        return 5*side;
    }
    double getSide(){
        return side;
    }
}
public class Shapess
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		double ra=sc.nextDouble();
		System.out.println("enter side of Pentagon");
		double pa=sc.nextDouble();
		System.out.println("enter side of Triangle");
		double ba=sc.nextDouble();
		
		Circle c1=new Circle(ra);
		System.out.printf("Radius of circle %.2f\n",c1.getSide());
		System.out.printf("Perimeter of circle %.2f\n",c1.getPerimeter());
		System.out.printf("Area of circle %.2f\n\n",c1.getArea());
 		Triangle t1=new Triangle(ba);
        System.out.printf("Side of Triangle %.2f\n",t1.getSide());
		System.out.printf("Perimeter of Triangle %.2f\n",t1.getPerimeter());
		System.out.printf("Area of Triangle %.2f\n\n",t1.getArea());
        Pentagon p1=new Pentagon(pa);
		System.out.printf("Side of Pentagon %.2f\n",p1.getSide());
		System.out.printf("Perimeter of Pentagon %.2f\n",p1.getPerimeter());
		System.out.printf("Area of Pentagon %.2f\n",p1.getArea());
		sc.close();
	}
}