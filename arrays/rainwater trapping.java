
//gfg:
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] left= new int[n];
        int[] right=new int[n];
        left[0] = arr[0];
        
        for(int i=1;i<n;i++){
            left[i]= Math.max(left[i-1],arr[i]);
        }
        right[n-1]= arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        long ans=0;
        for(int i=0;i<n;i++){
            ans+= (long)Math.min(left[i],right[i])-(long)arr[i];
        }
        return ans;
    } 
}

//leetcode:
class Solution {
    public int trap(int[] height) {
      int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        for(int i =1;i<n;i++){
            left[i] = Math.max(left[i-1],height[i]);
            
        }
        right[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            right[i] = Math.max(right[i+1] , height[i]);
        }
        int ans=0;
        for(int i =1;i<n;i++){
            ans+= Math.min(left[i],right[i])-height[i];
        }
        return ans;
    }
}
/*Complexity Analysis: 
Time Complexity: O(n). 
Only one traversal of the array is needed, So time Complexity is O(n).

Space Complexity: O(n). 
Two extra arrays are needed each of size n.

Explanation:
left array= Find max element on its left
right array= find max element on its right

The idea is to traverse every array element and find the highest bars on left and right side . 
take the smaller of 2 heights
The difference between the smaller height and height of the current element is the amount of water that can be stored in this array element.


