https://www.codingninjas.com/studio/problems/maximum-nesting-depth-of-the-parentheses_8144741?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

# bruteforce approach

## Java
```java
import java.util.*;

public class Solution {
    public static int maxDepth(String str) {
        // Write your code here.
        int count = 0;
        int maxDepth = 0;
        for(int i=0;i<str.length();i++){ //for(char c: s.toCharArray())
            if(str.charAt(i) == '('){    // if(c =='('){}
                count++;
                maxDepth = Math.max(maxDepth,count);
            }
            else if(str.charAt(i) == ')'){
                count--;
            }
        }
        return maxDepth;
    }
}
```
## Javascript
```javascript
function maxDepth(str){
    let count =0;
    let maxDepth = 0;
    for(let i=0;i<str.length;i++){
        if(str[i]== '('){
            count++;
            maxDepth = Math.max(maxDepth,count);
        }
        else if(str[i] == ')'){
            count--;
        }
    }
    return maxDepth;
}

console.log(maxDepth("(3*(4*(5*(6))))"));
```


# better approach
## Java
```Java


```
## JavaScript
```javascript

```

# optimal approach

## Java
```java


```


## Javascript
```javascript

```
