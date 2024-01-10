Notes in : < page number and location >

# Union of sorted array

## Bruteforce approach - using sets

### Java

```java
// link of problem : https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

import java.util.*;

public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        int n = a.length;
        int m = b.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        // if array in return type
        // int[] arr = new int[set.size()];
        // int index = 0;
        // for(int num:set){
        //     arr[index] = num;
        //     index++;
        // }

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);
        return list;

    }
}
```

### Javascript

```javascript
// link of problem :  OWN

var union = function(a,b) {
    let n = a.length;
    let m = b.length;
    let sets = new Set();
    for(let i =0;i<n;i++){
      sets.add(a[i]);
    }
    for(let i =0;i<m;i++){
      sets.add(b[i]);
    }
    let res = [];
    //let i=0;
    //for(let num of sets){
    // res[i] = num;
    // i++;
    //}
    for (let num of sets) {
      res.push(num);
    }

    return res;
};

const arr1 = [1, 2, 3, 4, 6];
const arr2 = [2, 3, 5]
const res = union(arr1,arr2);
console.log(res);


```

## Optimal approach - unable to understand

### Java

```java
// link of problem : 


```

### Javascript

```javascript
// link of problem : 

```
