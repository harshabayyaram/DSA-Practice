Notes in : S-step1.4-page-01

$$
{\color{red}COUNT-THE-DIGITS}
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
// link of problem : https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

public class abc {
    static int count_digits(int n){
        int x = n;
        int count = 0;
        while(x!=0){
            x= x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(count_digits(n));
    }
}

output :- 5
```

$$
{\color{green}JavaScript}
$$

```javascript
 // link of problem : https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

function count_digits(n) {
  let x = n;
  let count = 0;
  while (x != 0) {
    x = Math.floor(x / 10);
    count++;
  }
  return count;
}

let ans = count_digits(12345);

console.log(ans);
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
// link of problem : https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
class HelloWorld {
    static int count_digits(int n){
        String str = Integer.toString(n);
        return str.length();
    }
    public static void main(String[] args) {
        System.out.println(count_digits(12345));
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript
// link of problem : https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
function count_digits(n) {
  let str = n.toString();
  return str.length;
}

let ans = count_digits(12345);

console.log(ans);
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
// link of problem : https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
class HelloWorld {
    static int count_digits(int n){
        int ans =  (int)Math.floor(Math.log10(n)+1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(count_digits(12345));
    }
}

```

$$
{\color{green}JavaScript}
$$

```javascript
// link of problem : https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

function count_digits(n){
    let ans = Math.floor(Math.log10(n)+1);
    return ans;
}

let ans = count_digits(12345);

console.log(ans);
```
