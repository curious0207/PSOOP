import java.util.Scanner;
class Main{
    public static int gcd(int n,int d){
        if(n==0){
            return d;
        }
        return gcd(d%n,n);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=6;
        int nu[]=new int[5];
        int de[]=new int[5];
        System.out.print("-----");
        for(int i=1;i<6;i++){
            int num=i;
            int deno=6;
            int g=gcd(num,deno);
            num/=g;
            deno/=g;
            System.out.print(num+"/"+deno);
            System.out.print("  ");
        }
        System.out.println("\n");
        for(int i=1;i<6;i++){
            int num=i;
            int deno=6;
            int g=gcd(num,deno);
            num/=g;
            deno/=g;
            nu[i-1]=num;
            de[i-1]=deno;
            System.out.println(num+"/"+deno);
            System.out.print("  ");
            for(int k=0;k<5;){
                for(int j=0;j<5;j++){
                int pnum=nu[k]*nu[j];
                int pdeno=de[k]*de[j];
                int gp=gcd(pnum,pdeno);
                pnum/=gp;
                pdeno/=gp;
                System.out.print(pnum+"/"+pdeno);
                System.out.print("  ");
                }
                System.out.println("\n");
                k++;
                
            }
            
            
        }
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<5;j++){
        //         int pnum=nu[i]*nu[j];
        //         int pdeno=de[i]*de[j];
        //         int g=gcd(pnum,pdeno);
        //         pnum/=g;
        //         pdeno/=g;
        //         System.out.print(pnum+"/"+pdeno);
        //         System.out.print("  ");
        //     }
        // }
        //System.out.println("\n");
    }
}