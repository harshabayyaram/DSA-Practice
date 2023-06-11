/*

link : https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1


Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13
Your Task:
Your task is to complete printFibb() which takes single argument N and returns a list of first N Fibonacci numbers.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Note: This space is used to store and return the answer for printing purpose.

Constraints:
1<= N <=84
 */




// try 1


class Solution
{
    //Function to return list containing first n fibonacci numbers. 1 1 2 3 5 8
    public static long[] printFibb(int n) 
    {
        //Your code here
        long v[]=new long[n];
        v[0]=v[1]=1;
        for(int i =2;i<n;i++){
            v[i]=v[i-1]+v[i-2];
        }
        return v;
    }
}



//try 2
class Solution
{
    //Function to return list containing first n fibonacci numbers. 1 1 2 3 5 8
    public static long[] printFibb(int n) 
    {
        //Your code here
        long v[]=new long[n];
        v[0]=1;
        if(n>1){
            v[1]=1;
        }
        for(int i =2;i<n;i++){
            v[i]=v[i-1]+v[i-2];
        }
        return v;
    }
}

