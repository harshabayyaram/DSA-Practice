Notes in : S-step1.4-page-04

$$
{\color{red}GCD/HCF}
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
  
    static int gcd(int n1,int n2){
        int ans = 0;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                ans = i;
            }
        }
        return ans;
    }
  
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        System.out.println(gcd(n1,n2));
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript
function gcd(n1,n2){
        let ans = 0;
        for(let i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                ans = i;
            }
        }
        return ans;
    }
  
  
console.log(gcd(20,40));

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
class HelloWorld {
  
    static int gcd(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>n2) n1 = n1%n2;
            else n2 = n2%n1;
        }
        if(n1==0) return n2;
        else return n1;
    }
  
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        System.out.println(gcd(n1,n2));
    }
}

```

```java
class HelloWorld {
  
    static int gcd(int n1,int n2){
        if(n2==0){
            return n1;
        }
        return gcd(n2,n1%n2);
    }
  
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        System.out.println(gcd(n1,n2));
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript
function gcd1(n1,n2){
    while(n1>0 && n2>0){
        if(n1>n2) n1 = n1%n2;
        else n2 = n2%n1;
    }
    if(n1==0) return n2;
    else return n1;
}

function gcd2(n1, n2){
    if(n2==0){
        return n1;
    }
    return gcd2(n2,n1%n2);
}
  
console.log(gcd1(20,40));
console.log(gcd2(20,40));

```
