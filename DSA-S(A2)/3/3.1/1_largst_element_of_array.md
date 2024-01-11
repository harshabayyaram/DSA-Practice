Notes in : DSA-General -07 bakc(lins notes new hyd)

# Largest element in an array

## Bruteforce approach

### Java

```java
// link of problem :  https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/

static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
```

### Javascript

```javascript
// link of problem : https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
function sortArr(arr) {
  arr.sort((a, b) => a - b);
  return arr[arr.length - 1];
}
```

## Optimal approach - recursive approach

### Java

```java
// link of problem : https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/



static int findLargestElement(int arr[]) {
    int max= arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max= arr[i];
      }
    }
    return max;
  }
```

### Javascript

```javascript
// link of problem : https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
function findLargestElement(arr) {
  let max = arr[0];
  for (let i = 0; i < arr.length; i++) {
    if (max < arr[i]) {
      max = arr[i];
    }
  }
  return max;
}
```
