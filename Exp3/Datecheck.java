import java.util.Scanner;

class Date{
    int year,month,date,hrs,min,sec,count;
    int a,b,c,d,e,f;
    Date(){
        year=2000;
        month=1;
        date=1;
        hrs=00;
        min=00;
        sec=00;
    }
    void displayDate(){
        String m="";
        switch (b){
            case 1:
                m="January";
                break;
            case 2:
                m="February";
                break;
            case 3:
                m="March";
                break;
            case 4:
                m="April";
                break;
            case 5:
                m="May";
                break;
            case 6:
                m="June";
                break;
            case 7:
                m="July";
                break;
            case 8:
                m="August";
                break;
            case 9:
                m="September";
                break;
            case 10:
                m="October";
                break;
            case 11:
                m="Novmber";
                break;
            case 12:
                m="December";
                break;
        }
        if(count==1){
            System.out.println(m+" "+c+" "+a);
        }
        else if(count==2){
            System.out.println(m+" "+c+" "+a+" "+d+":"+e);
        }
        else if(count==3){
            System.out.println(m+" "+c+" "+a+" "+d+":"+e+":"+f);
        }
    }
    void setDate(int year,int month,int date){
        count=1;
        a=year;
        b=month;
        c=date;
        displayDate();
    }
    void setDate(int year,int month,int date,int hrs,int min){
        count=2;
        a=year;
        b=month;
        c=date;
        d=hrs;
        e=min;
        displayDate();
    }
    void setDate(int year,int month,int date,int hrs,int min,int sec){
        count=3;
        a=year;
        b=month;
        c=date;
        d=hrs;
        e=min;
        f=sec;
        displayDate();
    }
    
}

public class Datecheck
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter 1 to display date with 3 paramters\n2 to display date with 5 paramters\n3 to display date with 6 paramters");
		int n=sc.nextInt();
        int hr,min;
        System.out.println("Enter the year");
		int yr=sc.nextInt();
        System.out.println("Enter the month");
		int mo=sc.nextInt();
        System.out.println("Enter the date");
		int dat=sc.nextInt();
		Date d1=new Date();
        if(n==1){
            d1.setDate(yr,mo,dat);
        }
		else if(n==2){
            System.out.println("Enter hours");
            hr=sc.nextInt();
            System.out.println("Enter minutes");
            min=sc.nextInt();
		    Date d2=new Date();
            d2.setDate(yr, mo, dat, hr, min);
        }
        else if(n==3){
            System.out.println("Enter hours");
            hr=sc.nextInt();
            System.out.println("Enter minutes");
            min=sc.nextInt();
            System.out.println("Enter seconds");
            int s=sc.nextInt();
            Date d3=new Date();
            d3.setDate(yr, mo, dat, hr, min,s);
        }
		
	    sc.close();	
	}
}