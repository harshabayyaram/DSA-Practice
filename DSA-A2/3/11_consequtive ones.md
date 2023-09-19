# bruteforce approach

## Java
```java

```
## Javascript
```javascript
var findMaxConsecutiveOnes = function(nums) {
    let  n = nums.length;
    let cnt = 0;
    let maxi = 0;
    for(let i=0;i<n;i++){
        if(nums[i] === 1){
            cnt++;
        }else{
            cnt = 0;
        }
        maxi = Math.max(cnt,maxi);
    }
    return maxi;
};
```
