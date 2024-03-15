Notes in : < page number >

$$
{\color{red}Print-1-to-N}
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
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        print(1,n);
    }

    public static void print(int i , int n){
        if(i>n) return;
        System.out.println(i);
        print(i+1,n);
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript

    function main() {
        let n = 5;
        print(1,n);
    }

    function print(i , n){
        if(i>n) return;
        console.log(i)
        print(i+1,n);
    }
  
    main();
```

---

$$
{\color{yellow}Java }
$$

```Java
class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        print(n,n);
    }

    public static void print(int i , int n){
        if(i<1) return;
        print(i-1,n);
        System.out.println(i);
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript

    function main() {
        let n = 5;
        print(n,n);
    }

    function print(i , n){
        if(i<1) return;
        print(i-1,n);
        console.log(i);
    }
  
    main();
```
