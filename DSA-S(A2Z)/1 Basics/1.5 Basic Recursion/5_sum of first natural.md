Notes in : < page number >

$$
{\color{red}Sum-of-first-Natural-Numbers}
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
    public static void main(String[] args) {
        int n = 5;
        System.out.println(print(n));
    }

    public static int print(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript

    function main() {
        let n = 5;
        console.log(print(n))
    }

    function print(n){
        let sum = 0;
        for(let i=0;i<=n;i++){
            sum += i;
        }
        return sum;
    }
  
    main();
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
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(print(n));
    }

    public static int print(int n){
        return n*(n+1)/2;
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript

    function main() {
        let n = 5;
        console.log(print(n))
    }

    function print(n){
        return n*(n+1)/2;
    }
  
    main();
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
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(print1(n,0));
        System.out.println(print2(n));
    }

    public static int print1(int i, int sum){
        if(i<0){
            return sum;
        }
        return print1(i-1,sum+i);
    }
  
    public static int print2(int n){
        if(n==0){return 0;};
        return n+print2(n-1);
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript

    function main() {
        let n = 5;
        console.log(print1(n,0))
        console.log(print2(n))
    }

    function print1(n,sum){
        if(n==0){
            return sum;
        }
        return print1(n-1,sum+n);
    }
  
    function print2(n){
        if(n==0){
            return 0;
        }
        return n + print2(n-1);
    }
  
    main();
```
