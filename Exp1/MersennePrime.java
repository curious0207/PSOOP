import java.lang.Math;
class MersennePrime{
    public static void main(String[] args) {
        int p,flag=0;
        for(p=2;p<=31;p++){
            long num=(long)Math.pow(2,p)-1;
            flag=0;
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Mersenne prime: "+num);
                System.out.print("value of p: "+p);
                System.out.println();
            }
        }
    }
}