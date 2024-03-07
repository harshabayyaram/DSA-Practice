
Notes in : S-Step1.4-02

$$
{\color{red}Reverse-A-Number}
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
  
    static int reverse(int n){
        int x = n;
        int reverse = 0;
        while(x!=0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x= x/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(n+" reverse is = "+reverse(n));
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript
// link of problem : 
function reverse(n){
    let x = n;
    let reverse = 0;
    while(x!=0){
        let digit = x%10;
        reverse = reverse*10+digit;
        x=Math.floor(x/10);
    }
    return reverse;
}


console.log(reverse(12345));
```
