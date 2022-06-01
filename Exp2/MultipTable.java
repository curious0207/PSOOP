import java.util.Scanner;
class MultipTable{
    public static int gcd(int n,int d){
        if(n==0){
            return d;
        }
        return gcd(d%n,n);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table");
        int n=sc.nextInt();
        int a[]=new int[5];
        int b[]=new int[5];
        System.out.print("\t");
        for(int i=1;i<6;i++){
            int num=i;
            int deno=n;
            int g=gcd(num,deno);
            num/=g;
            deno/=g;
            a[i-1]=num;
            b[i-1]=deno;
            System.out.print(num+"/"+deno);
            System.out.print("\t");
        }
        System.out.println("\n");
        for(int i=1;i<6;i++){
            int num=i;
            int deno=n;
            int g=gcd(num,deno);
            num/=g;
            deno/=g;
            System.out.print(num+"/"+deno);
            System.out.print("\t");
            for(int k=0;k<5;k++){
                int pnum=num*a[k];
                int pdeno=deno*b[k];
                int gp=gcd(pnum,pdeno);
                pnum/=gp;
                pdeno/=gp;
                System.out.print(pnum+"/"+pdeno);
                System.out.print("\t");
                
            }
            System.out.println();
            
        }
        sc.close();
    }
}