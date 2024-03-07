Notes in : DSA_General-15

# Count number of digits

## Bruteforce approach

### Java

```java
// link of problem : 

public class Solution {
    public static int countDigits(int n) {
        // Write your code here.
        int num = n;
        int temp =0;
        int count = 0;

        while (n > 0) {
            temp = n % 10;
            if (temp > 0) {
                if (num % temp == 0) {
                    count++;
                }
            }
            n = n / 10;
        }
        return count;
    }
}

```

### Javascript

```javascript
// link of problem : 

```

## Better approach

### Java

```Java
// link of problem : 
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        String s = Integer.toString(n);
        return s.length();
    }
}

```

### JavaScript

```javascript
// link of problem : 

function countDigits(n){
    let x = n.toString();
    return x.length;
}

let n = 123;
console.log(countDigits(n));
```

## Optimal approach

### Java

```java
// link of problem : 

static int count_digits(int n)
    {
       int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    } 
```

### Javascript

```javascript
// link of problem : 
function count(n){
	let digits = Math.floor(Math.log10(n) + 1);
	return digits;
}
```
