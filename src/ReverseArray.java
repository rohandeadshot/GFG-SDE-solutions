// Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array

public class ReverseArray {
    public void reverseArray(int arr[]) {
        // code here
        int j=arr.length-1;
        int mid = arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(i==mid) break;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}
