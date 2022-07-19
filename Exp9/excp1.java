import java.util.*;

class Cricketer {
    String name;
    int runs, in_count, not_out;
    double bavg;

    Cricketer(String name, int runs, int in_count, int not_out) {
        this.name = name;
        this.runs = runs;
        this.in_count = in_count;
        this.not_out = not_out;
    }

    void get_avg() {
        try{
            bavg = runs / (in_count - not_out);
            //System.out.println("The batting average is " + bavg);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
    }
}

public class excp1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Cricketer c1[] = new Cricketer[n];
        try {
            for(int i = 0; i <n; i++) {
                int runs = 0, innings_count = 0, not_out_count = 0;
                String nm = "";
                //String str = sc.nextLine();
                try {
                    System.out.println("Enter the name of player");
                    nm = sc.nextLine();
                } catch (NumberFormatException e1) {
                    System.out.println("Number format exception");
                }
                try {
                    System.out.println("Enter the total number of runs hit by the player");
                    runs = sc.nextInt();
                    System.out.println("Enter the total number of innings played");
                    innings_count = sc.nextInt();
                    System.out.println("Enter the not out innings played by the player");
                    not_out_count = sc.nextInt();
                    sc.nextLine();
                } catch (ArrayStoreException e2) {
                    System.out.println("Invalid data stored in array");
                }
                c1[i] = new Cricketer(nm, runs, innings_count, not_out_count);
                c1[i].get_avg();
            }
        }
        catch(ArrayIndexOutOfBoundsException e3) {
            System.out.println("Array index out of bounds");
        }
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(c1[j].bavg<c1[min].bavg){
                    min=j;
                }
            }
            Cricketer temp=c1[i];
            c1[i]=c1[min];
            c1[min]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(c1[i].name);
            System.out.println("Runs "+ c1[i].runs);
            System.out.println("Batting average "+ c1[i].bavg);
        }
        sc.close();
    }
}