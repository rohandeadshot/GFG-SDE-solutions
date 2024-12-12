import java.util.HashMap;

// Link : https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

public class ArraySubset {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long,Integer> map = new HashMap<>();
        int counter =0 ;
        
        if(m>n) return "No";
        
        for(int i=0;i<n;i++){
            map.put(a1[i],map.getOrDefault(a1[i],0)+1);
        }
        // System.out.println(map.toString());
        for(int i=0;i<m;i++){
            if(!map.containsKey(a2[i])) return "No";
            if(!(map.get(a2[i])>=1)) return "No";
            map.replace(a2[i],map.get(a2[i])-1);
            counter++;
        }
        
        if(counter == m){
            return "Yes";
        }
        return "No";
    }
}
