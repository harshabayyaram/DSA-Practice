# bruteforce approach

## Java
```java
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
```
## Javascript
```javascript
class Solution {
    search(arr, N, X) {
        // write your code here
        for(let i=0;i<N;i++){
            if(arr[i]==X){
                return i;
            }
        }
        return -1;
    }
}
```
## javascript taking input form the user geeks for geeks drive code
https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
```javascript



'use strict';
process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data',inputStdin => {
  inputString  = inputString.trim().split('\n').map(sting =>{
      return string.trim();
});
main();
});

function readLine(){
  return inputString[surrentLine++];
}
function main(){
  let t = parseInt(readLine());
  let i=0;
  for(;i<t;i++)
  {
      let N,X;
      N = parseint(readLine());
      let arr = readLine().split(' ').map(x=>parseInt(x));
      X = parseInt(readLine());
      let obj = new Solution();
      console.log(obj.search(arr,N,X);
  }
} 

```
