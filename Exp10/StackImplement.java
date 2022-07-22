import java.util.Scanner;

import Harsh.StackPack;

public class StackImplement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackPack st=new StackPack();
        for(int i=0;i<5;i++){
            System.out.println("Enter 1 to push data and 2 to pop data");
                int ch=sc.nextInt();
                if(ch==1){
                System.out.println("Enter the element to be pushed");
                int n=sc.nextInt();
                st.push(n);
                st.display();
            }
            else if(ch==2){
                st.pop();
                st.display();
            }
        }
        sc.close();
    }
    
}
