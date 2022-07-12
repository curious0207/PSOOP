import java.util.*;
interface Volume{
    public void getVolume();
}
interface SurfaceArea{
    public void getSurfaceArea();
}
class Cylinder implements Volume,SurfaceArea{
    int r,h;
    Cylinder(int r,int h){
        this.r=r;
        this.h=h;
    }
    public void getVolume(){
        double vol=Math.PI*r*r*h;
        System.out.printf("Volume of cylinder %.2f\n",vol);
    }
    public void getSurfaceArea(){
        double area=2*Math.PI*r*(h+r);
        System.out.printf("Surfcae area of cylinder %.2f ",area);
    }
}
public class Interface1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter radius of cylinder");
	    int r=sc.nextInt();
	    System.out.println("enter height of cylinder");
	    int h=sc.nextInt();
	    Cylinder c1=new Cylinder(r,h);
	    c1.getVolume();
	    c1.getSurfaceArea();
        sc.close();
	}
}