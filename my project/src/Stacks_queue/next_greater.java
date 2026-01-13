package Stacks_queue;
import java.util.*;
public class next_greater {
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        next(arr);
    }
    public static void next(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] num=new int[n];
        
        for (int i =n-1 ; i >=0; i--) {
            while (st.size()!=0 && arr[i]>=arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                num[i]=-1;
            }
            else{
                    num[i]=arr[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
