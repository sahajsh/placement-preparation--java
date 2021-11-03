import java.util.*;
import java.lang.*;
import java.io.*;


 public class Main
{
	public static void main (String[] args) 
	{   
        Scanner sc = new Scanner(System.in);
        int[] arr ={-12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int n = sc.nextInt();
        int s = 0;
        int e = n-1;
        
        while(s <= e){
            if(arr[s] > 0 && arr[e] > 0){
               e--;
            }
            else if(arr[s] <0 && arr[e] <0){
             s++;
            }
            else if(arr[s] > 0 && arr[e] < 0){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            } 
            else{
               
                s++;
                e--;

            }
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

		
	}
}

