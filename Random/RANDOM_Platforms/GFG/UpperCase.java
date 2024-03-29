/*
Given a string str, convert the first letter of each word in the string to uppercase. 

Example 1:

Input:
str = "i love programming"
Output: "I Love Programming"
Explanation:
'I', 'L', 'P' are the first letters of 
the three words.

Your Task:  
You dont need to read input or print anything. Complete the function transform() which takes s as input parameter and returns the transformed string.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N) to store resultant string  


Constraints:
1 <= N <= 104
The original string str only consists of lowercase alphabets and spaces to separate words.
*/

class Solution
{
    public String transform(String s)
    {
        // code here
        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                newWord = true;
                result.append(c);
            } else {
                if (newWord) {
                    result.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }

        return result.toString();
    }
}
