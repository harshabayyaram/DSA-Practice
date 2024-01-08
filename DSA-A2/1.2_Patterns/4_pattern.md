## java
```java
  public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
```
```javascript
let string = ""

for(let i =1;i<=5;i++){
  for(let j =1;j<=i;j++){
    string += i + " ";
  }
  string += "\n";
}

console.log(string);
```
```python
def triangle( n:int) ->None:
    # Write your solution here.
    for i in range(1,n+1):
        for j in range(1,i+1):
            print(i,end=" ")
        print()
    pass
```
