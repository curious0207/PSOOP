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
       String nm,ty="",h1="",h2="";
       for(int i=0;i<n;i++){
           nm=sc.next();
           //ty=sc.nextLine();
           //h1=sc.nextLine();
           //h2=sc.nextLine();
           sc.nextLine();
           bg[i]=sc.nextInt();
           arr[i]=new movie(nm,ty,h1,h2);          
        }
       // sort
       System.out.println("Movies sorted according to their budget");
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(bg[j]<bg[i]){
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
            System.out.print(bg[i]+" ");
            //System.out.println(min);
             
            System.out.println(arr[i].a);
            System.out.println();
        }
       sc.close();
    }
}