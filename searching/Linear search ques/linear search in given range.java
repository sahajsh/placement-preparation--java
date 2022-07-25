//search index for a given range-
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		int[] nums={1,2,3,4,8};
        int target=0;
        System.out.println(linearSearch(nums,target,2,4));
	}
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            int element =arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}

