
import java.util.*;
import java.lang.*;
import java.io.*;

/* Linear search in 2d arrays */
class Main
{
	public static void main (String[] args)
	{
		
        int[][] arr={
                        {56,8,18},
                        {4,6,7},
                        {1,2,34}
        };
       int target=4;
       int[] ans=search(arr,target);
       System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}











        
    

