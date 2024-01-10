# Remove duplicates from Sorted array
# bruteforce approach

## Java
```java
import java.util.*;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		HashSet<Integer> set =  new HashSet<>();
		// for(int i=0;i<n;i++){
		// 	set.add(arr[i]);
		// }
		//unable to use for loop with 0 to n on arraylist 
		//it is asking for arraylist not array
		for(int a:arr){
			set.add(a);
		}
		return set.size();
	}
}
```
## Javascript
```javascript
onst removeDuplicates = (a,n) =>{
    var sets = new Set();
    a.forEach(function(value){
        sets.add(value);
    })
    return sets;
};


const arr = [1,2,3,3,2,3,4,1,2,3];
var rD = removeDuplicates(arr,arr.length);
var res = [rD];
console.log(res);
```
## javascript with set to string
```javascript
const removeDuplicates = (a,n) =>{
    var sets = new Set();
    a.forEach(function(value){
        sets.add(value);
    })
    const res = Array.from(sets).join(',');
    return res;
};


const arr = [1,2,3,3,2,3,4,1,2,3];
var rD = removeDuplicates(arr,arr.length);
console.log(rD);
```

# optimal approach

## Java
```java
import java.util.*;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int i=0;
		// for(int j=1;j<n;j++){
		// 	if(arr[i]!=arr[j]){
		// 		arr[i++] = arr[j];
		// 		i++;
		// 	}
		// }
		for(int j=1;j<n;j++){
			if(!arr.get(j).equals(arr.get(j-1))){
				arr.set(i++,arr.get(j));
			}
		}
		return i+1;
	}
}

```


## Javascript
```javascript
var removeDuplicates = function(nums) {
    var i=0;
    for(var j=0;j<nums.length;j++){
        if(nums[i]!==nums[j]){
            i++;
            nums[i] = nums[j];
        }
    }
    return i+1;
};

const arr = [1,2,3,4,2,2,2,1];
const res = removeDuplicates(arr);
console.log(res);
```


