Notes in : S-step1.4-page-09

$$
{\color{red}Print-All-Divisors}
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
class HelloWorld {
  
    static void Divisors(int n){
        for(int i = 1 ;i<=n;i++){
            if(n%i==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        int n1 = 36;
        int n2 = 12;
        Divisors(n1);
        Divisors(n2);
    }
}

```

```java
import java.util.*;

class HelloWorld {
  
    static ArrayList<Integer> Divisors(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1 ;i<=n;i++){
            if(n%i==0) {
                arr.add(i);
            }
        }
        return arr;
    }
  
    public static void main(String[] args) {
        int n1 = 36;
        ArrayList<Integer> divisorsN1 = Divisors(n1);
        System.out.println(divisorsN1);
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript
function Divisors(n){
        for(let i = 1 ;i<=n;i++){
            if(n%i==0) {
                process.stdout.write(i + " ");
            }
        }
        console.log("\n");
    }
  
Divisors(36);
Divisors(36);
```

```javascript
function Divisors(n){
        let array = []
        for(let i = 1 ;i<=n;i++){
            if(n%i==0) {
               array.push(i)
            }
        }
        // return array.toString();
        return array.join(" ");
    }
  
// Divisors(36);
console.log(Divisors(36));
// Divisors(36);

```

---

---

$$
{\color{blue}**Better-Approachh**}
$$

$$
{\color{yellow}Java}
$$

```Java
import java.util.*;

class HelloWorld {
  
    static ArrayList<Integer> Divisors(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1 ;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                arr.add(i);
                if(n/i != i) arr.add(n/i);
            }
        }
        Collections.sort(arr);
        return arr;
    }
  
    public static void main(String[] args) {
        int n1 = 36;
        ArrayList<Integer> divisorsN1 = Divisors(n1);
        System.out.println(divisorsN1);
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript
function Divisors(n){
        let arr = []
        for(let i = 1 ;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                arr.push(i);
                if(n/i != i) arr.push(n/i);
            }
        }
        return arr.sort((a,b)=>a-b).toString();
    }
  
  
console.log(Divisors(36));
```
