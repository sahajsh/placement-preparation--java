
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		// find minimum element in the array using linear search
        int[] arr={1,239,45,22,99};
        System.out.println(max(arr));


    }
  //assume arr.length!=0 and array is unsorted
    static int max(int[] nums){
        int max=nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

}

