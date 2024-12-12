import java.util.ArrayList;
import java.util.Collections;

// Link : https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        Integer leaderElement = arr[n-1];
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        
        for(int i=n-1;i>=0;i--){
            if(leaderElement<=arr[i]){
                arrlist.add(arr[i]);
                leaderElement = arr[i];
            }
        }
        // System.out.println(arrlist.toString);
        Collections.sort(arrlist,Collections.reverseOrder());
        return arrlist;
        
    }
}
