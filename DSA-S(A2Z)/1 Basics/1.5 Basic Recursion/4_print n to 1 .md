Notes in : < page number >

$$
{\color{red}Print-N-to-1}
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
        print(n,n);
    }

    public static void print(int i , int n){
        if(i<1) return;
        System.out.println(i);
        print(i-1,n);
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
        console.log(i)
        print(i-1,n);
    }
  
    main();
```

---

$$
{\color{blue}**Better-Approachh**}
$$

```javascript

    function main() {
        let n = 5;
        print(1,n);
    }

    function print(i , n){
        if(i>n) return;
        print(i+1,n);
        console.log(i)
    }
  
    main();
```


```java

class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        print(1,n);
    }

    public static void print(int i , int n){
        if(i>n) return;
        print(i+1,n);
        System.out.println(i);
    }
}
```