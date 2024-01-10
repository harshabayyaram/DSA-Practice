## JAVA
```java

```
```javascript
var removeDuplicates = function(nums) {
    let rd = 0;
    for(let i=1;i<=nums.length;i++){
        if(nums[rd]!==nums[i]){
            rd++;
            nums[rd]=nums[i];
        }
    }
    return rd;
};
```
