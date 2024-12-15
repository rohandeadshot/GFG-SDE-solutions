import java.util.Arrays;

// Link : https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1

public class ZigZag {
    public void zigZag(int a[], int n){
        // Code your solution here.
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(i%2!=0 & i<n-1 ){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        
    }
}
