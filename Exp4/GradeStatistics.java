import java.util.Scanner;
import java.lang.Math;
public class GradeStatistics
{
    static float avg(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
		    sum+=arr[i];
		}
		float average=sum/(float)n;
		return average;
    }
    
    static int minimum(int arr[],int n){
        return arr[0];
    }
    
    static int maximum(int arr[],int n){
        return arr[n-1];
    }
    
    static float median(int arr[],int n){
        float m;
        if(n%2==0){
            m=(arr[n/2]+arr[(n/2)-1])/2;
        }
        else{
            m=arr[n/2];
        }
        return m;
    }
    
    static double stdd(int arr[],int n,float av){
        float deviation[]=new float[n];
        float sumd=0;
        for(int i=0;i<n;i++){
            deviation[i]=((float)arr[i]-av)*((float)arr[i]-av);
            sumd+=deviation[i];
        }
        double standevia=Math.sqrt(sumd/(float)n);
        //String formattedString = String.format("%.02f", standevia);
        return standevia;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    System.out.println("Enter the grade for student "+(i+1));
		    arr[i]=sc.nextInt();
		}
		float avg2=avg(arr,n);
		System.out.printf("The average is %.2f\n",avg2);
		
		for(int i=0;i<n;i++){
		    int min=i;
		    for(int j=i+1;j<n;j++){
		        if(arr[j]<arr[min]){
		            min=j;
		        }
		    }
		    int temp=arr[i];
		    arr[i]=arr[min];
		    arr[min]=temp;
		}
		System.out.println("The minimum is " + minimum(arr,n));
		System.out.println("The maximum is " + maximum(arr,n));
		System.out.printf("The median is %.2f\n",median(arr,n));
		
		System.out.printf("The standard deviation is %.2f",stdd(arr,n,avg2));
		sc.close();
	}
}