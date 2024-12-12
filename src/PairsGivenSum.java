import java.util.ArrayList;
import java.util.Arrays;

// Link : https://www.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?page=1

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

public class PairsGivenSum {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        pair [] pairArr = {};
        ArrayList<pair> pairLst = new ArrayList<>();
        
        Arrays.sort(A);
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                long temp = A[i]+B[j];
                if(temp!=X){ 
                    continue;
                }
                // System.out.println(A[i]+ " "+ B[j]+"="+temp);
                pair tempPair = new pair(A[i],B[j]);
                pairLst.add(tempPair);
            }
        }
        // System.out.println(pairLst.toString());
        pairArr =new pair[pairLst.size()];
        for(int i=0;i<pairArr.length;i++){
            pairArr[i] = pairLst.get(i);
        }
        return pairArr;
    }
}
