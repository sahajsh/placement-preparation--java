public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		
       int largest=Integer.MIN_VALUE;
       int secondLargest=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
           if(arr[i]>largest)
           {
               secondLargest=largest;
               largest=arr[i];
           }
           if(arr[i]!=largest && arr[i]>secondLargest)
           {
               secondLargest=arr[i];
           }
       }
       if(secondLargest == Integer.MIN_VALUE)
           return -1;
       else
           return secondLargest;
   }
}
