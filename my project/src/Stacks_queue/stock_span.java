package Stacks_queue;
import java.util.*;
public class stock_span {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
            Stack<Integer> st=new Stack<>();
            int[] arr1=new int[arr.length];
            int span=0;
            
          for (int i = 0; i < arr.length; i++) {
            while (st.size()>0 && arr[st.peek()]<=arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span=i+1;
                arr1[i]=span;
            }
            else{
              span=i-st.peek();
              arr1[i]=span;
            }
            st.push(i);
          }
         for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"  ");
         }
    }

}
