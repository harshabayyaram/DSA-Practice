## JAVA
```java

```
```javascript Leetcode
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

```javascript GFG
class Solution{
    remove_duplicate(arr,n){
        //code here
        let rd = 0;
        for(let i =1;i<=n;i++){
            if(arr[i] !== arr[rd]){
                rd++;
                arr[rd]=arr[i]
            }
        }
        return rd;
    }
}
```
