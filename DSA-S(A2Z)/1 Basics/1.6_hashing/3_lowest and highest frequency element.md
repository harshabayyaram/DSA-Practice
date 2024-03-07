Notes in : DSA-general-11 ( new lines notes hyd new )

# lowest and highest frequency of an array

## Bruteforce approach - visited array and two pointer

### Java

```java
// link of problem : 

import java.util.*;

public class tUf {

    public static void main(String args[]) {

        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    }
}  
```

### Javascript

```javascript
// link of problem : 
function countFreq(arr) {
    let n = arr.length;
    let visited = new Array(n).fill(false);
    let maxFreq = 0, minFreq = n;
    let maxEle = 0, minEle = 0;

    for (let i = 0; i < n; i++) {
        // Skip this element if already processed
        if (visited[i] === true) {
            continue;
        }

        // Count frequency
        let count = 1;
        for (let j = i + 1; j < n; j++) {
            if (arr[i] === arr[j]) {
                visited[j] = true;
                count++;
            }
        }

        // Update most and least frequent elements
        if (count > maxFreq) {
            maxEle = arr[i];
            maxFreq = count;
        }
        if (count < minFreq) {
            minEle = arr[i];
            minFreq = count;
        }
    }

    console.log("The highest frequency element is: " + maxEle);
    console.log("The lowest frequency element is: " + minEle);
}

// Example Usage
let arr = [10, 5, 10, 15, 10, 5];
countFreq(arr);

```

## Optimal approach - using map

### Java

```java
// link of problem : 


```

### Javascript

```javascript
// link of problem : 

```
