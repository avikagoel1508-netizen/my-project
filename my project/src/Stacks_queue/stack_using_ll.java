package Stacks_queue;
import java.util.*;
public class stack_using_ll {
   private LinkedList<Integer> ll=new LinkedList<>();

   public void push(int val){
         ll.addFirst(val);
   }
   public int pop(){
   return ll.remove();
   }
   public int size(){
    return ll.size();
   }
   public int peek(){
   return ll.getFirst();
   }
public void display(){
    System.out.println(ll);
}
public static void main(String[] args) {
    stack_using_ll st=new stack_using_ll();
    st.push(10);
    st.push(20);
    st.push(30);
    st.display();
    System.out.println(st.size());
    st.pop();
    st.display();
    System.out.println(st.size());
}
}
