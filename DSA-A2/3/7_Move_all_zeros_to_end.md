# bruteforce approach

## Java
```java
import java.util.ArrayList;

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(a[i]!=0){
                temp.add(a[i]);
            }
        }
        int nz = temp.size();
        for(int i=0;i<nz;i++){
            a[i] = temp.get(i);
        }
        for(int i=nz;i<n;i++){
            a[i] = 0;
        }
        return a;
    }
}
```
## Javascript
```javascript
class Solution {
    pushZerosToEnd(arr,n){
        //code here
        let temp = [];
        let j = 0;
        for(let i=0;i<n;i++){
            if(arr[i]!==0){
                temp[j] = arr[i];
                j++;
            }
        }
        
        let nz = temp.length;
        //or we can use j instead
        
        for(let i=0;i<nz;i++){
            arr[i] = temp[i];
        }
        
        for(let i=nz;i<n;i++){
            arr[i] = 0;
        }
        
        return arr;
    }
}
```

# optimal approach using two pointer approach

## Java
```java
import java.util.ArrayList;

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int j = -1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return a;
        for(int i = j+1; i<n;i++){
            if(a[i]!=0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
}

```


## Javascript
```javascript
class Solution {
    pushZerosToEnd(arr,n){
        //code here
        let j=-1;
        for(let i=0;i<n;i++){
            if(arr[i]===0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;
        
        for(let i=j+1;i<n;i++){
            if(arr[i] !== 0){
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
```


