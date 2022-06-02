class cash{
    int money(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=300*Math.random();
        }
        return sum;
    }
}

public class Game {
    public static void main(String[] args) {
        cash p1=new cash();
        int sum1=p1.money();
        cash p2=new cash();
        int sum2=p2.money();
        System.out.println("Total cash of person 1: "+sum1+"  "+"\nTotal cash of person 2: "+sum2);
        if(sum1>sum2){
            System.out.println("Person 1 wins");
        }
        else{
            System.out.println("Person 2 wins");
        }
    }
}
