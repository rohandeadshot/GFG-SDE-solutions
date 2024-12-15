// Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751

public class MoveZerosToEnd {
    void pushZerosToEnd(int[] arr) {
        // code here
        int [] temp = new int[arr.length];
        int j = 0;
        int n = arr.length;
        
        // for(int i=0;i<temp.length;i++){
        //     System.out.print(temp[i]+" , ");
        // }
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                // System.out.println("j : "+j+" temp : "+temp[j]);
                j++;
            }
        }
        if(j==0) return;
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
}
