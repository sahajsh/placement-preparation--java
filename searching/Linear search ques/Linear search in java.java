mport java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		// your code goes here
     int[] arr1 = {1,2,34,89,90};
     int target =90;
     int ans= linearSearch(arr1,target);
     System.out.println(ans);

	}
    static int linearSearch(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
    for(int i=0;i<arr.length;i++){
      int element=arr[i];
      if(element==target){
          return i;
      }
    }
    // if none of the return statements executed hence the target is not found.
    //so this line will be executed

    return -1;

}
}
// search the target and return the element itself.
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// search the target and return the element itself.
          int[] arr = {1,2,3,4,5};
          int target= 2;
          int ans = linearSearch(arr,target);
          System.out.println(ans);
        
	}
    static int linearSearch(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }
        for(int element:nums){
           if(element==target){
               return element;
           }
        }
        return -1;
    }
}

//IF -1 Is an element---------
import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
          int[] arr = {1,2,3,4,5};
          int target= 8;
          int ans = linearSearch(arr,target);
          System.out.println(ans);
        
	}
    static int linearSearch(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }
        for(int element:nums){
           if(element==target){
               return element;
           }
        }
        return Integer.MAX_VALUE;
    }
}


