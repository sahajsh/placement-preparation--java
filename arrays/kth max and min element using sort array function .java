//kth max and min element using sort array function ->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {6,2,3,56,78};
        int k =4;
        int n =5;
        Arrays.sort(arr);//sorting function in java 
        System.out.println(Arrays.toString(arr));
        System.out.println("the "+ k + "th smallest no is " + arr[k-1] );
        System.out.println("the " + k +  "th largest number is " + arr[n-k] );

	}
}

