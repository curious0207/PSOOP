import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cart[][][]=new int[3][][];
        int costliest[]=new int[3];
        int b,count=0;
        for(int i=0;i<3;i++){
            int sum=0;
            System.out.println("Cart "+(i+1));
            System.out.println("Enter total no. of items");
            b=sc.nextInt();
            cart[i]=new int[b][2];
            int max=0;
            for(int j=0;j<b;j++){
                System.out.println("Enter cost of item "+(j+1));
                cart[i][j][0]=sc.nextInt();
                sum+=cart[i][j][0];
                System.out.println("Enter 1:if item is perishable or 0:if item is non-perishable");
                cart[i][j][1]=sc.nextInt();
                if(cart[i][j][1]==1){
                    count++;
                }
                if(cart[i][j][1]==0 && cart[i][j][0]>cart[i][max][0]){
                    max=j;
                }
            }
            //System.out.println("Costliest non-perishable item is "+ cart[i][max][0]);
            costliest[i]=cart[i][max][0];
            System.out.println("Cost of cart "+(i+1)+" is " + sum);
        }
        
        System.out.println("No. of perishable items sold "+count);
        int maxc=0;
        for(int i=1;i<3;i++){
            if(costliest[i]>costliest[maxc]){
                maxc=i;
            }
        }
        System.out.println("The costliest non-perishable item sold " + costliest[maxc]);
        sc.close();
    }
}