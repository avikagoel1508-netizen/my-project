package Stacks_queue;
import java.util.*;
public class valid_parantheses{
    public static void main(String[] args) {
        String str="()[]{}";
         System.out.println(valid(str));
    }
    public static boolean valid(String str){
        Stack<Character> st=new Stack<>();
       for (int i = 0; i < str.length(); i++) {
        char ch=str.charAt(i);
        if (ch=='(' || ch=='{' || ch=='[') {
            st.push(ch);
        }
        else{
            if (st.isEmpty()) {
                return false;
            }
            if ((st.peek()=='(' && ch==')')|| (st.peek()=='{' && ch=='}') || (st.peek()=='[' && ch==']')) {
                st.pop();
            }
            else{
                return false;
            }
        }
       }
       return st.size()==0;
    }
}