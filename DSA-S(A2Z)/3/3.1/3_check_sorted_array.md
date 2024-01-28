# bruteforce approach

## Java

```java
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){

            }
            else{
                return 0;
            }
        }


        return 1;
    }
}
```

## Javascript

```javascript
const checkSorted = (a,n)=>{
    for(var i=1;i<n;i++){
            if(a[i]>=a[i-1]){

            }
            else{
                return 0;
            }
        }


        return 1;
}

const arr = [1,2,3,4,5];

var isSorted = checkSorted(arr,arr.length);

console.log(isSorted);
```

bruteforce is the best
