/* 
Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.


Example 1:

Input:
N = 5
arr[] = {4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Explanation:
Maintain sorted (in bold) and unsorted subarrays.
Select 1. Array becomes 1 4 3 9 7.
Select 3. Array becomes 1 3 4 9 7.
Select 4. Array becomes 1 3 4 9 7.
Select 7. Array becomes 1 3 4 7 9.
Select 9. Array becomes 1 3 4 7 9.
Example 2:

Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10

Your Task:  
You dont need to read input or print anything. Complete the functions select() and selectionSort() ,where select() takes arr[] and starting point of unsorted array i as input parameters and returns the selected element for each iteration in selection sort, and selectionSort() takes the array and it's size and sorts the array.


Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 10^3

  */




class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++){
            if (arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
        // Return the selected element for this iteration
        return arr[minIndex];
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	        int smallest = i;
	        for(int j = i+1;j<n;j++){
	            if(arr[smallest]>arr[j]){
	                smallest = j;
	            }
	        }
	        
	        int temp = arr[i];
	        arr[i] = arr[smallest];
	        arr[smallest]=temp;
	    }
	    
	}
}
