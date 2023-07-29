/*

1. Execute the given function.
def differenceofSum(n.m)

The function takes two integrals m and n as arguments. You are required to obtain the total of all integers ranging between 1 to n (both inclusive) which are not divisible by m. You must also return the distinction between the sum of integers not divisible by m with the sum of integers divisible by m.

Assumption

m > 0 and n > 0
Sum lies within the integral range
 
Example

Input:
m = 6
n = 30

Output:
285

Integers divisible by 6 are 6, 12, 18, 24, and 30. Their sum is 90.
Integers that are not divisible by 6 are 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19, 20, 21, 22, 23, 25, 26, 27, 28, and 29. Their sum is 375.
The difference between them is 285 (375 – 90).
 
Sample input:
m = 3
n = 10

Sample output:
19

  */

import java.util.Scanner;

public class Main
{
    
    public static int differenceofSum(int m,int n){
        int div =0;
        int notdiv =0;
        if(m<0 || n<0){
            return -1;
        }
        else{
            for(int i =0;i<=n;i++){
                if(i%m==0){
                    div += i;
                }
                else{
                    notdiv += i;
                }
            }
        }
        System.out.println(div);
        System.out.println(notdiv);
        return(notdiv-div);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int k = differenceofSum(m,n);
		
		System.out.println(k);
	}
}



