package leetcode;

public class min_size_array {
public static void main(String[] args) {
    int[]arr={2,3,1,2,4,3};
     int target=7;
     System.out.println(size(arr, target));
}
public static int size(int[]arr, int target){

int minlen=Integer.MAX_VALUE;
int len=0;
      for (int i = 0; i < arr.length; i++) {
        int sum=0;
        for (int j = i; j < arr.length; j++) {
            sum+=arr[j];
            if (sum>=target) {
                len=j-i+1;
                minlen=Math.min(minlen, len);
                 break;
            }
           
        }
       
      }
      return Math.min(minlen, len);
}
}
