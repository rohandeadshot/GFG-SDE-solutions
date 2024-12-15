import java.util.Arrays;

// Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        int n = arr.length-1;
        int maxNum = arr[n];
        for(int i=n;i>=0;i--){
            if(arr[i]<maxNum)
                return arr[i];
        }
        return -1;
    }
}
