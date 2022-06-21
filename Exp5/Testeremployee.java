import java.util.Scanner;
class Recruitment {
    void result(float r){
		System.out.println("Result: "+r +"%");
        if(r>60){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        System.out.println("----------------------------");
    }
}
class Testing extends Recruitment{
    int ans[]={1,1,2,1,2,2,1,2};    // array of answers.
    float r;
    float marks;
    void takeTest(int ans1[],int size){
        marks=0;
        for(int i=0;i<size;i++){
            if(ans1[i]==ans[i]){
                marks+=2;
            }
        }
        generateResult(marks);
    }
    void generateResult(float answers){
        r=(answers/16)*100;
        super.result(r);
    }
}

public class Testeremployee
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=5;
	    int q=8;
	    
		Testing t1[]=new Testing[n];
		int a1[]=new int[q];     // array to store answers
		for(int i=0;i<n;i++){
			System.out.println("Employee "+(i+1)+" test starts");
		    System.out.println("Test 1-Questions:");
		    System.out.println("1.What is the vision of the company?");
		    System.out.println("Options:1. gfhyfhuruii\n\t2. hrehfrhghjti");
		    a1[0]=sc.nextInt();
		    System.out.println("2.How long will you stay in this role");
		    System.out.println("Options: 1. gfhyfhuruii\n\t2. hrehfrhghjti");
		    a1[1]=sc.nextInt();
			System.out.println("Test 2-Questions:");
		    System.out.println("1.What is final method in Java?");
		    System.out.println("Options: 1. the final keyword is used to denote constants and can be reinitialized\n\t2. the final keyword is used to denote constants and cannot be reinitialized");
		    a1[2]=sc.nextInt();
		    System.out.println("2.What is the latest version of Java?");
		    System.out.println("Options: 1. Java 18\n\t2. Java 17");
		    a1[3]=sc.nextInt();
			System.out.println("Test 3-Questions:");
		    System.out.println("1.What did you learn about Java in last job?");
		    System.out.println("Options: 1. gfhyfhuruii\n\t2. hrehfrhghjti");
		    a1[4]=sc.nextInt();
		    System.out.println("2.What do you wish to learn?");
		    System.out.println("Options: 1. xyz\n\t2. abc");
		    a1[5]=sc.nextInt();
			System.out.println("Test 4-Questions:");
		    System.out.println("1.What makes a team successful?");
		    System.out.println("Options: 1. gfhyfhuruii\n\t2. hrehfrhghjti");
		    a1[6]=sc.nextInt();
		    System.out.println("2.Do you work faster in team or as individual?");
		    System.out.println("Options: 1. gfhyfhu\n\t2. hrehfhti");
		    a1[7]=sc.nextInt();
 
		    t1[i]=new Testing();
		    t1[i].takeTest(a1,q);   // taking test of employee i.
		}
		sc.close();
	}
}