Notes in : S-step-1.4-page-08

$$
{\color{red}ARMSTRONG-NUMBER}
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
  
    static boolean Armstrong(int n){
        int original = n;
        int count = 0;
        int temp = n;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum = sum + (int)Math.floor(Math.pow(digit,count));
            n=n/10;
        }
        return sum==original;
    }
  
    public static void main(String[] args) {
        int n1 = 153;
        int n2 = 1232;
        System.out.println(Armstrong(n1));
        System.out.println(Armstrong(n2));
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript
 function Armstrong(n){
        let original = n;
        let count = 0;
        let temp = n;
        while(temp!==0){
            temp = Math.floor(temp/10);
            count += 1;
        }
        let sum = 0;
        while(n!==0){
            let digit = n%10;
            sum = sum + Math.floor(Math.pow(digit,count));
            n=Math.floor(n/10);
        }
        return sum===original;
    }
  
console.log(Armstrong(153));
console.log(Armstrong(1522));
 function Armstrong(n){
        let original = n;
        let count = 0;
        let temp = n;
        while(temp!==0){
            temp = Math.floor(temp/10);
            count += 1;
        }
        let sum = 0;
        while(n!==0){
            let digit = n%10;
            sum = sum + Math.floor(Math.pow(digit,count));
            n=Math.floor(n/10);
        }
        return sum===original;
    }
  
console.log(Armstrong(153));
console.log(Armstrong(1522));

```
