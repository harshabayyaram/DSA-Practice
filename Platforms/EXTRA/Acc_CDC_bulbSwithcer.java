/*

https://www.hackerrank.com/contests/cdc-contest-3rd-yr/challenges/bulb-switcher-4-1/copy-from/1364891713

There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.

Return the number of bulbs that are on after n rounds.

Example 1: Input: n = 3

Output: 1

Explanation: At first, the three bulbs are [off, off, off].

After the first round, the three bulbs are [on, on, on].

After the second round, the three bulbs are [on, off, on].

After the third round, the three bulbs are [on, off, off].

So you should return 1 because there is only one bulb is on.

Input Format

An integer n that represents the number of bulbs

Constraints

0 <= n <= 109

Output Format

Print the number of bulbs that are ON after n rounds

Sample Input 0

5
Sample Output 0

2
Sample Input 1

1
Sample Output 1

1

*/






import java.io.*;
import java.util.*;

public class Solution {
    
    public static int bulbSwitcher(int n){
        
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int ans = bulbSwitcher(n);
        System.out.println(ans);
    }
}
