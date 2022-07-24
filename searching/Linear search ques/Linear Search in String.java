//string is an array of characters.
// to go at every index of string we use str.charAt(i)

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String name="kunal";
		char target='o';
		System.out.println(search(name,target));

	}
	static boolean search(String str,char target){
		if(str.length()==0){
			return false;
		}
		for(int i =0;i<str.length();i++){
            if(target==str.charAt(i)){
		return true;
			}
		}
		return false;
	}
}

//by sing for each loop and iterate through array

