/*

//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&difficulty[]=0&curated[]=8&sortBy=submissions

Missing number in array
EasyAccuracy: 29.59%Submissions: 805K+Points: 2
Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106

  */



// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        
        for (int num : array) {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
}
