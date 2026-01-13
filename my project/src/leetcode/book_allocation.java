

public class book_allocation {
public static void main(String[] args) {
    int[] arr={12, 34, 67, 90};
    int k=2;
    int n=arr.length;
   System.out.println(allocate(arr, k));

}
public static int allocate(int[] arr, int k){
        int n=arr.length;
    if (k>n) {
        return -1;
    }
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
   int lo=0;
   int hi=sum;
   int ans=-1;
   while (lo<=hi) {
    int mid=lo+(hi-lo)/2;
    if (isvalid(arr, k, n, mid)) {//left
        ans=mid;
        hi=mid-1;
    }
    else{
        lo=mid+1;
    }
   }
   return ans;
}
private static boolean isvalid(int[] arr, int k, int n, int maxallowedpages) {
  int students=1;
  int pages=0;
  for (int i = 0; i < arr.length; i++) {
    if (arr[i]>maxallowedpages) {
        return false;
    }
    if (pages+arr[i]<=maxallowedpages) {
        pages+=arr[i];
    }
    else{
        students++;
        pages=arr[i];
    }
  }
  if (students>k) {
    return false;
  }
return true;
}
}
