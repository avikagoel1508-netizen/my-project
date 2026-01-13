

public class median_sorted_array {
public static void main(String[] args) {
int[] arr1={1,2};
int[] arr2={3,4};
 System.out.println(median(arr1, arr2));
}
public static double median(int[] arr1, int[] arr2){
    int n=arr1.length;
    int m=arr2.length;
    int[] merge=new int[m+n];
    double med=-1;
    int i=0; int j=0; int k=0;
   while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        // remaining elements
        while (i < n) {
            merge[k++] = arr1[i++];
        }

        while (j < m) {
            merge[k++] = arr2[j++];
        }
            
        if (merge.length%2!=0) {
            med=merge[merge.length/2];
            return med;
            
        }
        else{
            med=((merge[(merge.length/2)-1]+merge[merge.length/2])/2.0);
        }
        return med;
    }
       
}

