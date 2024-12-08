// link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
// solution for missing in array problem

class missingInArray {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int totalSum = 0;
        int arrSum = 0;
        for(int i =0;i<n-1;i++){
            arrSum+=array[i];
        }
        for(int i=1;i<=n;i++){
            totalSum+=i;
        }
        // System.out.println(arrSum+" "+ totalSum);
        return totalSum-arrSum;
    }
}