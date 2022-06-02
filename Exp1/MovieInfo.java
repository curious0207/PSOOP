import java.util.Scanner;
import java.util.Arrays;
class movie{
    String name,type,hname,hiname;
    int b;

    movie(String name,String type,String hname,String hiname,int b){
        this.name=name;
        this.type=type;
        this.hname=hname;
        this.hiname=hiname;
        this.b=b;
    }

}

public class MovieInfo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter total no. of movies to store info of");
       int n=sc.nextInt();
       movie arr[]=new movie[n];
       for(int i=0;i<n;i++){
           String nm=sc.nextLine();
           String ty=sc.nextLine();
           String h1=sc.nextLine();
           String h2=sc.nextLine();
           sc.nextLine();
           int bg=sc.nextInt();
           arr[i]=new movie(nm,ty,h1,h2,bg);    
       }
       //System.out.println(arr[0].b); 
       for(int i=0;i<n;i++){
           int min=i;
           for(int j=i+1;j<n;j++){
                if(arr[j].b<arr[min].b){
                    min=j;
                }
           }
          // System.out.println(arr[min].name);
           int temp=arr[i].b;
           arr[i].b=arr[min].b;
           arr[min].b=temp;
           //System.out.println(arr[min].name);
       }
       System.out.println("sorted bugdet:");
       for(int k=0;k<n;k++){
           System.out.println(arr[k].b);
       }
       sc.close();
    }
}
