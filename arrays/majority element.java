//GFG: moore voting algorithm
class Solution
{
    static int majorityElement(int a[], int size)
    {
// your code here
      int maxValue=a[0];
      int count=1;
     
      for(int i=1;i<size;i++){
          if(maxValue == a[i]){
              count++;
          }else{
              count--;
          }
          if(count==0){
              maxValue= a[i];
              count=1;
              
          }
          
      }
      
      count=0;
     for(int i=0;i<size;i++){
         if(a[i]==maxValue)
         count++;
     }
     if(count>size/2)return maxValue;
     else return -1;
      
 }
 
}
//
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        int maxValue=arr[0];
        int count=1;
       
        for(int i=1;i<n;i++){
            if(maxValue==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                maxValue=arr[i];
                count=1;
            }
            
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(maxValue==arr[i])
                c++;
            
        }
        if(c>n/2)
            return maxValue;
        else
            return -1;
	}
}



//Leetcode: moore voting algorithm:
class Solution{
    public int majorityElement(int[] nums){
        // moore voting algorithm
        int maxValue= nums[0];
        int count =1;
        for(int i =1;i<nums.length;i++){
            if(maxValue==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maxValue=nums[i];
                count=1;
            }
        }
        return maxValue;
}
}
   
