package  mypack;

import java.util.*;

class movie{
    String a,b,c,d;
    movie(String name,String type,String hname,String hiname){
        a=name;
        b=type;
        c=hname;
        d=hiname;
    }
}

class MovieInfo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter total no. of movies to store info of");
       int n=sc.nextInt();
       movie arr[]=new movie[n];
       int bg[]=new int[n];
       String nm,ty,h1,h2;
       for(int i=0;i<n;i++){
           System.out.println("Enter name of the movie");
           nm=sc.next();
           sc.nextLine();
           System.out.println("Enter type of the movie");
           ty=sc.nextLine();
           System.out.println("Enter name of the hero in the movie");
           h1=sc.nextLine();
           System.out.println("Enter name of the heroine in the movie");
           h2=sc.nextLine();
           System.out.println("Enter budget of the movie");
           bg[i]=sc.nextInt();
           arr[i]=new movie(nm,ty,h1,h2);          
        }
        System.out.println();
       // sort
       System.out.println("Movies sorted according to their budget: ");
       System.out.println("Budget\t Movie Information\n");
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(bg[j]<bg[min]){
                    min=j;
                }
            }
            int temp=bg[i];
            bg[i]=bg[min];
            bg[min]=temp;
            // string swap
            String temps=arr[i].a;
            arr[i].a=arr[min].a;
            arr[min].a=temps;
            temps=arr[i].b;
            arr[i].b=arr[min].b;
            arr[min].b=temps;
            temps=arr[i].c;
            arr[i].c=arr[min].c;
            arr[min].c=temps;
            temps=arr[i].d;
            arr[i].d=arr[min].d;
            arr[min].d=temps;

            System.out.print(bg[i]+"\t");
            System.out.println(arr[i].a + " "+ arr[i].b +" "+ arr[i].c +" "+ arr[i].d);
            System.out.println();
        }
       sc.close();
    }
}