package Harsh;

class StackOverflowError extends RuntimeException{
    public void msg(){
        System.out.println("Stack Overflow");
    }
}
class StackUnderflowError extends RuntimeException{
    public void msg1(){
        System.out.println("Stack Underflow");
    }
}
public class StackPack {
    int size;
    int maxsize=10;
    int a[]=new int[maxsize];
    public StackPack(){
        size=-1;
    }
    public void push(int n){
        size++;
        try{
            if(size>maxsize){
                throw new StackOverflowError();
            }
            else{
                a[size]=n;
            }
        }
        
        catch(StackOverflowError e){
            e.msg();
        }
    }
    public void pop(){
        try{
            if(size==-1){
                throw new StackUnderflowError();
            }
            else{
                size--;
            }
        }
        catch(StackUnderflowError e1){
            e1.msg1();
        }
    }
    public void display(){
        System.out.println("Stack elements");
        for(int i=size;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
