import java.util.Scanner;
class Stock{
    String name;
    int n=8;
    int arr[]=new int[8];
    Scanner sc=new Scanner(System.in);
    void prices(){
        for(int i=0;i<8;i++){
            arr[i]=sc.nextInt();
        }
    }
    

}
class Transaction extends Stock{
    void findMaximumProfit(){
        int sum=0;
        prices();
        for(int i=0;i<n-1;i++){
            while(i<n-1&&arr[i+1]>arr[i]){   // stock buy
                sum+=arr[i+1]-arr[i];
                i++;
            }
            // sell at i.
        }
        System.out.println("Total profit earned " + sum);
    }
}

public class StocksProfit {
    public static void main(String[] args) {
        Transaction t1=new Transaction();
        t1.findMaximumProfit();
    }
    
}
