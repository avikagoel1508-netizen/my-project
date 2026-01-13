

public class longest_subarray {
public static void main(String[] args) {
    int k=52;
    int[]arr={94 ,-33, -13, 40 ,-82, 94, -33, -13, 40, -82};
    int i=0;
    int len=0;
    int maxlen=0;
    int sum=0;
    for (int j = 0; j < arr.length; j++) {
        sum+=arr[j];
        if (sum==k) {
           len=j-i+1;
           if (len>maxlen) {
            maxlen=len;
           }

            
        }
    }
    sum=0;
    i++;
    int ts=0;
    for (int j = 0; j < arr.length; j++) {
        ts+=arr[j];
    }
    if (ts==k) {
        maxlen=arr.length;
    }
     int p=Math.max(maxlen, len);
    System.out.println(p);

}
}
