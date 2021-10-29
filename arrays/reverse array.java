		
    
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i =0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int i =0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x: arr){
            System.out.println(x);
        }

	}
}

