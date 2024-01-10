/*
https://www.codechef.com/problems/LARGESECOND
*/


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]= sc.nextInt();
		    }
		    
		    int largest = a[0];
		    int sLargest = -1;
		    for(int i=0;i<n;i++){
		        if(a[i]>largest){
		            sLargest = largest;
		            largest = a[i];
		        }else if(a[i]<largest && a[i]>sLargest){
		            sLargest = a[i];
		        }
		    }
		    System.out.println(largest+sLargest);
		}
	}
}
