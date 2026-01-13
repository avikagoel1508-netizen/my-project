

import java.util.HashMap;

public class singlenumber {
public static void main(String[] args) {
    int[]nums={4,1,2,1,2};
HashMap<Integer, Integer> map=new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    if(!map.containsKey(nums[i])){
        map.put(nums[i], 1);
    }
    else{
        map.put(nums[i], map.get(nums[i])+1);
    }
}
for (int key : map.keySet()) {
    int p=map.get(key);
    if(p==1){
        System.out.println(key);
    }
}
}
}
