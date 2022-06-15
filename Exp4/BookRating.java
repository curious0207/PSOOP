import java.util.Scanner;

public class BookRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        float sum=0;
        float bookRating[][] = new float[n][];
        float avg[] = new float[n];
        for (int i = 0; i < n; i++) {
            sum = 0;
            System.out.println("For Book " + (i + 1));
            System.out.println("How many readers have given the rating");
            int m = sc.nextInt();
            bookRating[i] = new float[m]; // jagged array - variable column size - m.
            for (int j = 0; j < m; j++) {
                System.out.println("Enter rating by reader " + (j + 1));
                bookRating[i][j] = sc.nextFloat();
                sum += bookRating[i][j];
            }
            avg[i] = sum / m;
        }
        int max=0;
        for(int i=1;i<n;i++){
            if(avg[i]>avg[max]){
                max=i;
            }
        }
        System.out.println("Most popular book is book- "+ (max+1));
        sc.close();
    }

}
