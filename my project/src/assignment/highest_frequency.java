package assignment;
import java.util.*;
public class highest_frequency {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      int[]arr=new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
      }
    HashMap<Integer, Integer> map=new HashMap<>();
    
    for (int i = 0; i < arr.length; i++) {
    if (!map.containsKey(arr[i])) {
        map.put(arr[i], 1);
    }
    else{
        map.put(arr[i], map.get(arr[i])+1);
    }
}
int max=0;
int maxfreq=arr[0];
for (int key : map.keySet()) {
    int freq=map.get(key);
    if (freq>max) {
        max=freq;
        maxfreq=key;
    }
}
System.out.println(maxfreq);
}
}
