## java

```java
public class Solution {
    public static void seeding(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

## javascript

```javascript
let string = ""

for(let i =1;i<=5;i++){
  for(let j =1;j<=5-i;j++){
    string += "* ";
  }
  string += "\n";
}

console.log(string);
```

## python

```python
def seeding(n: int) -> None:
    # Write your solution here.
    for i in range(1,n+1):
        for j in range(n-i+1):
            print("* ",end="")
        print()
    pass

def seeding(n: int) -> None:
    # Write your solution here.
    for i in range(0,n+1):
        for j in range(1,n-i+1):
            print("* ",end="")
        print()
    pass
```
