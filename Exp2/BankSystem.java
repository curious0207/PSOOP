import java.util.*;
class bank2Constructor{
    int ibal;
    float ri;
    bank2Constructor(int bal,float roi){
        ibal=bal;
        ri=roi;
    }
    void deposit(int depo){
        ibal+=depo;
    }
    void withdraw(int draw){
        if(draw>ibal){
            System.out.println("Sorry!Insufficient funds");
        }
        else{
            ibal-=draw;
        }
    }
    void compi(int t){
        double ci=ibal*Math.pow((1+ri/100),t)-ibal;
        System.out.println("Compound Interest after "+ t+"years is "+ci);
    }
    void display(){
        System.out.println("Current balance of the account is " + ibal);
    }

}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to HTC Bank");
        System.out.println("Enter the initial balance");
        int bal=sc.nextInt();
        System.out.println("Enter the rate of interest");
        float roi=sc.nextFloat();
        bank2Constructor b1=new bank2Constructor(bal, roi);
        while(true){
            System.out.println("Enter 1:To make deposit, 2:To withdraw an amount for the balance\n3:To find compound interest, 4:To know the balance amount");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter the amount to deposit");
                int depo=sc.nextInt();
                b1.deposit(depo);
                break;
                case 2:
                System.out.println("Enter the amount you want to withdraw");
                int draw=sc.nextInt();
                b1.withdraw(draw);
                break;
                case 3:
                System.out.println("Enter the time period to calculate compound interest");
                int t=sc.nextInt();
                b1.compi(t);
                break;
                case 4:
                b1.display();
                break;
            }
            System.out.println("enter 1 to get back to menu or 0 to exit");
            int flag=sc.nextInt();
            if(flag==0){
                System.out.println("Thank you");
                break;
            }
        }
        sc.close();
    }
}
