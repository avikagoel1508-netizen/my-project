package leetcode;

public class binary_reflection {
public static void main(String[] args) {
    int[]arr={4,5,4};
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
public static int binaryreverse(int num){
    int rev=0;
    while (num>0) {
        int lastdig=num%2;
        rev=rev*2+lastdig;
        num=num/2;
    }
    return rev;
}
public static int[] sort(int[]arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length-i-1; j++) {
            int r1=binaryreverse(arr[j]);
            int r2=binaryreverse(arr[j+1]);
            if (r1>r2 || r1==r2 && arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    return arr;
}
}
