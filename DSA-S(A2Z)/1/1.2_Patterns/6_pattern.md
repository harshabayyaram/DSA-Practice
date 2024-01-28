1 2 3 4
1 2 3 
1 2 
1 

## java
```java
public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i =0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

```
```javascript
let string = ""

for(let i =1;i<=5;i++){
  for(let j =1;j<=5-i;j++){
    string += j+" ";
  }
  string += "\n";
}

console.log(string);
```
```python
def nNumberTriangle(n: int) -> None:
    # Write your solution here.
    for i in range(0,n):
        for j in range(1,n-i+1):
            print(j,end=" ")
        print()
    pass

```
