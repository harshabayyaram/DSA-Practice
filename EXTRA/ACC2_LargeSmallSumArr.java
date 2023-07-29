/*

https://www.codingninjas.com/studio/library/30-most-common-accenture-coding-questions

def LargeSmallSum(arr)

The function takes an integral arr which is of the size or length of its arguments. Return the sum of the second smallest element at odd position ‘arr’ and the second largest element at the even position.

Assumption

Every array element is unique.
Array is 0 indexed.
Note:

If the array is empty, return 0.
If array length is 3 or <3, return 0.
 
Example

Input:
Arr: 3 2 1 7 5 4

Output:
7
 

Explanation

The second largest element at the even position is 3.
The second smallest element at the odd position is 4.
The output is 7 (3 + 4).

  */


/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static int LargeSmallSum(int arr,int n){
        
        int secondSmallestOdd = Integer.MAX_VALUE;
        int secondLargestEven = Integer.MIN_VALUE;
        
        for(int i=0;i<=n;i++){
            if(i%2==0){
                if(arr[i]>secondLargestEven){
                    secondLargestEven = arr[i];
                }
            }
            else{
                
            }
        }
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {3,2,1,7,5,4};
		int n = arr.length;
		
		int ans = LargeSmallSum(arr,n);
		System.out.println(ans);
		
	}
}
