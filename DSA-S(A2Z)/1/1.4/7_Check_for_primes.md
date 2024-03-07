Notes in : S-step1.4-page11

$$
{\color{red}Heading-of-problem}
$$

---

---

$$
{\color{blue}**Bruteforce-Approachh**}
$$

$$
{\color{yellow}Java}
$$

```java
import java.util.*;

class HelloWorld {
  
    static boolean isprime1(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
  
    static boolean isprime2(int n){
        int cnt =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt == 2){
            return true;
        }
        return false;
    }
  
    public static void main(String[] args) {
        int n1 = 11;
        System.out.println(isprime1(n1));
        System.out.println(isprime2(n1));
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript

function isPrime(n){
    let cnt = 0;
    for(let i = 1 ;i<=n;i++){
        if(n%i==0) {
            cnt++
        }
    }
    if(cnt === 2){
        return true;
    }
    return false;
}
  
  
console.log(isPrime(11));
console.log(isPrime(36));
```



---

---

$$
{\color{blue}Optimal-Approachh}
$$

$$
{\color{yellow}Java}
$$

```java
import java.util.*;

class HelloWorld {
  
    static boolean isprime1(int n){
        for(int i=2;i<Math.sqrt(n);i++){
        // for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
  
    static boolean isprime2(int n){
        int cnt =0;
        // for(int i=1;i<=Math.sqrt(n);i++){
        // for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if(n/i != i) cnt++;
            }
        }
        if(cnt == 2){
            return true;
        }
        return false;
    }
  
    public static void main(String[] args) {
        int n1 = 11;
        System.out.println(isprime1(n1));
        System.out.println(isprime2(n1));
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript
function isPrime(n){
    let cnt = 0;
    for(let i = 1 ;i<=Math.sqrt(n);i++){
        if(n%i==0) {
            cnt++
            if(n/i!==i) cnt++;
        }
    }
    if(cnt === 2){
        return true;
    }
    return false;
}
  
  
console.log(isPrime(11));
console.log(isPrime(36));
```
