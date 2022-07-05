import java.util.*;

abstract class Questions {
    static int marks = 0;
    String question_text[] = new String[5];
    String answers[] = new String[5];
    String ans[] = { "True", "London", "True", "18", "True" };
    Questions() {
        question_text[0] = "Did India get freedom in 1947 ?";
        question_text[1] = "What is the capital of England ?";
        question_text[2] = "Is Tiger national animal of India?";
        question_text[3] = "What is the current java version ?";
        question_text[4] = "Can constrctor be overloaded?";
        answers[0] = "True or False";
        answers[1] = " A)London B)Manchester ";
        answers[2] = "True or False";
        answers[3] = " A)18 B)17";
        answers[4] = "True or False";
    }
    abstract void getQuestion();
    abstract void getSolution();
}

class TrueorFalse extends Questions {
    String str;
    Scanner sc = new Scanner(System.in);

    void getQuestion() {
        for (int i = 0; i <= 4; i = i + 2) {
            System.out.println(question_text[i]);
            System.out.println(answers[i]);
        }
        getSolution();
    }

    void getSolution() {
        for (int i = 0; i <= 4; i = i + 2) {
            str = sc.nextLine();
            if (str.compareTo(ans[i]) == 0) {
                marks = marks + 10;
            }
        }
        
    }
}
    
class MCQ extends Questions{
    String str;
    Scanner mc = new Scanner(System.in);
        void getQuestion() {
            for (int i = 1; i <= 3; i = i + 2)
            {
                System.out.println(question_text[i]);
                System.out.println(answers[i]);
            }
            getSolution();
        }
        void getSolution() {
            for (int i = 1; i <= 3; i = i + 2)
            {
                str = mc.nextLine();
                if (str.compareTo(ans[i]) == 0)
                {
                    marks = marks + 10;
                }
            }
            System.out.println("You have scored"+" "+marks+"/50"+" "+"in the quiz");
        }
}
public class QuizSystem {
    public static void main(String[] args) {
        TrueorFalse obj1=new TrueorFalse();
        MCQ obj2=new MCQ();
        obj1.getQuestion();
        obj2.getQuestion();
    }
}
