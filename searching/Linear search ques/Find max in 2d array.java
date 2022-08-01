
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
//search in a 2d arrays
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int[][] arr={
            {1,2,3,4},
            {5,6,7,9},
            {4,5}
        };
        int ans=max(arr);
        System.out.println(ans);

    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] >max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}

