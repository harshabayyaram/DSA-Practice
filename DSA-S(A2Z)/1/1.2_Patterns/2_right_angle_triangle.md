* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 


* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 

## java
```java
public static void nForest(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

```
## javascript
```javascript
let string = ""

for(let i =0;i<=5;i++){
  for(let j =0;j<=i;j++){
    string += "* ";
  }
  string += "\n";
}

console.log(string);

```
## python
```python
def nForest(n:int) ->None:
    # Write your solution here.
    for i in range(n):
        for j in range(i+1):
            print("* ",end="")
        print()
    pass
```
