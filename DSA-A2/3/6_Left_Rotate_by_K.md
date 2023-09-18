# bruteforce approach

## Java
```java
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        //rotate left
        int n =arr.length;
        k = k%n;
        int[] temp = new int[k];
        //move k elements into temp [1,2,3]
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }

        //move reamining elements to front [4,5,6,7.....]
        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }

        //attach temp elements to resultant array [4,5,6,7,1,2,3]
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i] = temp[j];
            j++;
        }
        return arr;
    }
}
```
## but we need arraylist in coding ninjas
```java
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        //rotate left
        int n =arr.size();
        k = k%n;
        ArrayList<Integer> temp = new ArrayList<>();
        //move k elements into temp [1,2,3]
        for(int i=0;i<k;i++){
            // temp[i] = arr[i];
            temp.add(arr.get(i));
        }

        //move reamining elements to front [4,5,6,7.....]
        for(int i=k;i<n;i++){
            // arr[i-k] = arr[i];
            arr.set(i-k,arr.get(i));
        }

        //attach temp elements to resultant array [4,5,6,7,1,2,3]
        int j=0;
        for(int i=n-k;i<n;i++){
            // arr[i] = temp[j];
            arr.set(i,temp.get(j));
            j++;
        }
        return arr;
    }
}
```
## Javascript
```javascript

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


