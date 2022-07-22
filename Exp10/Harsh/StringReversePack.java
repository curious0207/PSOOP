package Harsh;
public class StringReversePack{
    public String reverse(String s){
        String res="";
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}