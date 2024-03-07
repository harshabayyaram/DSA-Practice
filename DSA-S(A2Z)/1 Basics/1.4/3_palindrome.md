Notes in : S-Step1.4-page-03

$$
{\color{red}PALINDROME}
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
  
    static boolean palindrome(int n){
        int original = n;
        int reversed_number = 0;
    
        while(n!=0){
            int digit = n%10;
            reversed_number = reversed_number*10+digit;
            n=n/10;
        }
        if(reversed_number==original){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n =121;
        System.out.println(palindrome(n));
    }
}
```

$$
{\color{green}JavaScript}
$$

```javascript
function palindrome(n){
        let original = n;
        let reversed_number = 0;
    
        while(n!=0){
            let digit = n%10;
            reversed_number = reversed_number*10+digit;
            n= Math.floor(n/10);
        }
        if(reversed_number==original){
            return true;
        }
        return false;
}
  
  
console.log(palindrome(121));
console.log(palindrome(122));
```
