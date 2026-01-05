package leetcode;

import java.util.HashMap;

public class element_with_max_freq {
public static void main(String[] args) {
    int[]arr={1,2,3,4,5};
    HashMap<Integer, Integer> map=new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        if (!map.containsKey(arr[i])) {
            map.put(arr[i], 1);
        }
        else{
            map.put(arr[i], map.get(arr[i])+1);
        }
    }
    int maxfre=0;
    for (int key : map.keySet()) {
        int p=map.get(key);
        if (p>maxfre) {
            maxfre=p;
        }
    }
    int ans=0;
   for (int key : map.keySet()) {
    if (map.get(key)==maxfre) {
        ans+=map.get(key);
    }
   }
   System.out.println(ans);
}
}
