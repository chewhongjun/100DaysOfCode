import java.util.ArrayList;
import java.util.Stack;

public class BackspaceStringCompare {

    public static String transform(String str){
        String cleaned="";
        Stack<Character> s = new Stack<>();

        
        for(Character i : str.toCharArray()){
            if(i=='#'){
                if(!s.empty()){
                    s.pop();
            }else{
                s.push(i);
            }
            }
        }
        cleaned = s.toString();
        return cleaned;
    }

    public static void main(String[] args) {
        String S = "ab##";
        String T = "c#d#";
        System.out.println(transform(S));
        System.out.println(transform(T));
        System.out.println(transform(S).compareTo(transform(T)));
    }
}