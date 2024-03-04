Notes in : DSA-general-16

# GCD or HCF

## Bruteforce approach

### Java

```java
// link of problem : 

public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int ans = 0;
        for(int i = 1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                ans =i;
            }
        }
        return ans;
    }
}


another approach by changing loop

public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int ans = 0;
        for(int i = Math.min(m,n);i>=1;i--){
            if(n%i==0 && m%i==0){
                ans =i;
		break;
            }
        }
        return ans;
    }
}
```

### Javascript

```javascript
// link of problem : 

function calcGCD(n,m){
        let ans = 0;
        for(let i = 1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                ans =i;
            }
        }
        return ans;
}
```

## Better approach

### Java

```Java
// link of problem : 


public class Main {
  static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
  public static void main(String args[]) {
    int a = 4, b = 8;
    int ans = gcd(a, b);
    System.out.print("The GCD of the two numbers is "+ans);
  }
}
```

### JavaScript

```javascript
// link of problem : 
function gcd(a,b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
```
