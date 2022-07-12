import java.util.*;
interface EatItHere{
    public void deliverOrder();
    public void dispatchOrder();
}
interface TakeAway{
    public void deliverOrder();
    public void dispatchOrder();
}
class Consumer implements EatItHere,TakeAway{
    int ordernum,orderprice;
    Consumer(int num,int price){
        this.ordernum=num;
        this.orderprice=price;
    }
    public void deliverOrder(){
        if(500<0.1*orderprice){
            orderprice+=500;
        }
        else{
            orderprice+=(0.1*orderprice);
        }
        System.out.println("Total price of your order: " +orderprice);
    }
    public void dispatchOrder(){
        if(45>0.05*orderprice){
            orderprice+=45;
        }
        else{
            orderprice+=(0.05*orderprice);
        }
        System.out.println("Total price of your order: " +orderprice);
    }
}

public class Interface3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1- if u want to eat it here, 0- for takeaway");
		int choice=sc.nextInt();
        System.out.println("Enter order number");
		int num=sc.nextInt();
        System.out.println("Enter order price");
		int price=sc.nextInt();
		Consumer c1=new Consumer(num,price);
		if(choice==1){
		   c1.deliverOrder(); 
		}
		else{
		    c1.dispatchOrder();
		}
		sc.close();
	}
}