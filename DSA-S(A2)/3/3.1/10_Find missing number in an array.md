Notes in : DSA-general-10 (lines book hyd new)

# missing number in array

## Bruteforce approach

### Java

```java
// link of problem : 
```

### Javascript

```javascript
// link of problem : 

```

## Better approach

### Java

```Java
// link of problem : 

public static int missingNumber(int []a, int N) {

        int hash[] = new int[N + 1]; //hash array

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
```

### JavaScript

```javascript
// link of problem : 
function missingNumber(a, N) {
  const hash = new Array(N + 1).fill(0); // hash array

  // storing the frequencies:
  for (let i = 0; i < N - 1; i++) {
    hash[a[i]]++;
  }

  // checking the frequencies for numbers 1 to N:
  for (let i = 1; i <= N; i++) {
    if (hash[i] === 0) {
      return i;
    }
  }

  // The following line will never execute.
  // It is just to avoid warnings.
  return -1;
}
```

## Optimal approach

### Java

```java
// link of problem : 
public static int missingNumber(int []a, int n) {
        // Write your code here.
        int sum = (n*(n+1)/2);
        int s2=0;
        for(int i =0;i<n-1;i++){
            s2 += a[i];
        }

        return sum-s2;
    }

```

### Javascript

```javascript
// link of problem : 
function missingNumber(a, N) {
  // Summation of first N numbers:
  const summation = (N * (N + 1)) / 2;

  // Summation of all array elements:
  let s2 = 0;
  for (let i = 0; i < N - 1; i++) {
    s2 += a[i];
  }

  const missingNum = summation - s2;
  return missingNum;
}
```
