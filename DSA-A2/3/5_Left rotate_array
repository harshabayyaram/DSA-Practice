# bruteforce approach

## Java
```java
import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int[] newArr = new int[n];
        newArr[n-1] = arr[0];
        for(int i=1;i<n;i++){
            newArr[i-1] = arr[i];
        }
        return newArr;
    }
}
```
## Javascript

```javascript

const LeftRotate = (arr,n) =>{
    var newArr = new Array(n);
    newArr[n-1] = arr[0];
    for(let i=1;i<n;i++){
        newArr[i-1] = arr[i];
    }
    return newArr.toString();
};


const arr = [1,2,3,4,5,6];
var Lr = LeftRotate(arr,arr.length);
console.log(Lr);

```

# better approach
## Java
```Java
import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }
}

```
## JavaScript
```javascript
const LeftRotate = (arr,n) =>{
    var temp = arr[0];
    for(let i=1;i<n;i++){
       arr[i-1] = arr[i];
    }
    arr[n-1] = temp;
    return arr.toString();
};


const arr = [1,2,3,4,5,6];
var Lr = LeftRotate(arr,arr.length);
console.log(Lr);
```

