import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// Link: https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

public class arrayDuplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            int curVal = map.get(arr[i]);
            // System.out.println(arr[i] + " "+ curVal);
            if(!(curVal> 1)) continue;
            ans.add(arr[i]);
            map.replace(arr[i],0);
        }
        // System.out.println(ans.toString());
        if(!ans.isEmpty()){
            Collections.sort(ans);
            return ans;
        }
        ans.add(-1);
        return ans;
    }
}
