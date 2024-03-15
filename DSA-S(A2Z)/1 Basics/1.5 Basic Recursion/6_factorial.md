Notes in : < page number >

$$
{\color{red}Factorial-of-number}
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
        int n = 3;
        System.out.println(fact(n));
    }

    public static int fact(int n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans *=i;
        }
        return ans;
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript

    function main() {
        let n = 3;
console.log(fact(n));
    }

    function fact( n){
        let ans = 1;
        for(let i=1;i<=n;i++){
            ans *=i;
        }
        return ans;
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
class HelloWorld {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fact1(n,1));
        System.out.println(fact2(n));
    }

    public static int fact1(int i, int ans){
        if(i<1){
            return ans;
        }
        return fact1(i-1,ans*i);
    }
  
    public static int fact2(int n){
        if(n==1){return 1;};
        return n+fact2(n-1);
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript

    function main() {
        let n = 3;
        console.log(fact1(n,1))
        console.log(fact2(n))
    }

    function fact1(n,ans){
        if(n<1){
            return ans;
        }
        return fact1(n-1,ans*n);
    }
  
    function fact2(n){
        if(n==1){
            return 1;
        }
        return n + fact2(n-1);
    }
  
    main();
```
