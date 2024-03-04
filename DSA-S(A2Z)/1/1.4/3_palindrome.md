Notes in : DSA_Genereal-15 backside

# Palindrome number or not

## Bruteforce approach

### Java

```java
// link of problem : 

public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int original_num = n;
        int reverse_num = 0;
        while(n!=0){
            int rem = n%10;
            reverse_num = reverse_num *10 +rem;
            n=n/10;
        }

        if(original_num == reverse_num){
            return true;
        }
        return false;

    }
}
```

### Javascript

```javascript
// link of problem : 
    function palindromeNumber(n){
        let original_num = n;
        let reverse_num = 0;
        while(n!=0){
            int rem = n%10;
            reverse_num = reverse_num *10 +rem;
            n=n/10; Math.floor(n/10)
        }

        if(original_num === reverse_num){
            return true;
        }
        return false;

    }
```
