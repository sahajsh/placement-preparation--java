
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int[] a= new int[8];
        for(int i =0 ;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int min =a[0];
        int max= a[0];
        for(int i =1;i<=a.length-1;i++){
            if(a[i] > max){
                max= a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        

	}
}
