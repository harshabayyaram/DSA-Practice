
problem link : https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

# bruteforce approach

## Java
```java
public class Solution {
    public static int countDigits(int n) {
        // Write your code here.
        int num = n;
        int temp =0;
        int count = 0;

        while (n > 0) {
            temp = n % 10;
            if (temp > 0) {
                if (num % temp == 0) {
                    count++;
                }
            }
            n = n / 10;
        }
        return count;
    }
}
```
## Javascript
```javascript

```
