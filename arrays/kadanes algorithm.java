//max contiguous sum subarray-
public class Solution {
    
    public int maxSubArray(final int[] A) {// function returns maxsum. 
        int max=Integer.MIN_VALUE;//max value is neg also if all elements in array are negative 
        int currsum= 0;
        for(int i =0;i<A.length;i++){
            currsum =currsum+A[i];
            if(currsum>max){
                max=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return max;
    }
}
// if overall current sum is neg we dont include and take value of currsum =0. start adding from next step. 
