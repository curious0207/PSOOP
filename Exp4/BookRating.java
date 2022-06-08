import java.util.Scanner;
public class BookRating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=4;
        System.out.println("How many readers have given the rating");
        int m=sc.nextInt();
        int bookRating[][]=new int[n][m];
        for(int i=0;i<n;i++){
        System.out.println("For Book "+(i+1));
            for(int j=0;j<m;j++){
                System.out.println("Enter rating by reader "+(j+1));
                bookRating[i][j]=sc.nextInt();
            }
        }
    }
    
}
