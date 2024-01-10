/*

https://www.hackerrank.com/contests/cdc-contest-3rd-yr/challenges/roman-to-integer-22-2/submissions/code/1364890370
https://www.hackerrank.com/contests/cdc-contest-3rd-yr/challenges/roman-to-integer-22-2/problem


A string s is given as input which is roman numerals return its value in base-10

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Example 1:

Input: s = "III"

Output: 3

Explanation: III = 3.

Example 2:

Input: s = "LVIII"

Output: 58

Explanation: L = 50, V= 5, III = 3.

Example 3:

Input: s = "MCMXCIV"

Output: 1994

Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Input Format

A single string, s, denoting the Roman representation of the number is given.

Constraints

1.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
Output Format

Print the base-10 representation of the value.

Sample Input 0

III
Sample Output 0

3
Sample Input 1

LVIII
Sample Output 1

58


*/

import java.io.*;
import java.util.*;

public class Solution {
    
    public static int romanToDecimal(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int decimalValue = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            if (currentValue < prevValue) {
                decimalValue -= currentValue;
            } else {
                decimalValue += currentValue;
            }

            prevValue = currentValue;
        }

        return decimalValue;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String romanNumeral = scanner.nextLine().toUpperCase();
        scanner.close();

        int decimalValue = romanToDecimal(romanNumeral);
        System.out.println(decimalValue);
    }
}
