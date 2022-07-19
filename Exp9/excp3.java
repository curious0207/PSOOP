import java.util.*;
abstract class Account{
    String name;
    double balance;
    String acc;
    abstract void deposit(double a);
    abstract void withdraw(double w);
    abstract void disply();
}
class LessThanMinBalance extends Exception{
    public void msg3(){
        System.out.println("Balance is less than min. balance");
    }
}
class InsufficientAmountException extends Exception{
    public void msg2(){
        System.out.println("Amount to be transfered is more than the balance");
    }
}
class NegativeamountException extends Exception{
    public void msg1(){
        System.out.println("balance amount is negative");
    }
}

class SavingAcc extends Account{
    double interestRate,minBalance=1000;
    void add_interest(int yrs){
        balance+=(balance*interestRate*yrs)/100;
    }
    void transfer(double t){
        try{
            if(t>balance){
                throw new InsufficientAmountException();
            }
            else{
                balance-=t;
            }
        }
        catch(InsufficientAmountException e1){
            e1.msg2();
        }
    }
    void withdraw(double a){
        Scanner st=new Scanner(System.in);
        int y=st.nextInt();
        add_interest(y);
        balance-=a;
        try{
            if(balance<0){
                balance=0;
                throw new NegativeamountException();
            }
            else if(balance<minBalance){
                throw new LessThanMinBalance();
            }
        }
        catch(NegativeamountException e1){
            e1.msg1();
        }
        catch(LessThanMinBalance e3){
            e3.msg3();
        }
        disply();
    }
    void deposit(double am){
        balance+=am;
        try{
            if(balance<minBalance){
                throw new LessThanMinBalance();
            }
        }
        catch(LessThanMinBalance e3){
            e3.msg3();
        }
        disply();
    }
    void disply(){
        System.out.println("Current Bank Balamce "+balance);
    }
}
public class excp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to HTC bank");
        System.out.println("Mimimum Balance is set to Rs.1000");
        SavingAcc a1=new SavingAcc();
        System.out.println("Enter name of account holder");
        a1.name=sc.nextLine();
        System.out.println("Enter account number");
        a1.acc=sc.nextLine();
        while(true){
            System.out.println("Enter 1:to deposit money, 2: to withdraw money, 3: to transfer money and 0: to quit");
            int ch=sc.nextInt();
            if(ch==0){
                break;
            }
            if(ch==1){
                double amount=sc.nextDouble();
                a1.deposit(amount);
            }
            else if(ch==2){
                double b=sc.nextDouble();
                a1.withdraw(b);
            }
            else if(ch==3){
                double t=sc.nextDouble();
                a1.transfer(t);
            }
        }
        sc.close();
    }
    
}
