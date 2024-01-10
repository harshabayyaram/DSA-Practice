Notes in : DSA-General-02 ( lines notebook new hyd)

# Remove duplicates from Sorted array

## bruteforce approach

### Java

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

### Javascript

```javascript
const removeDuplicates = (a,n) =>{
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

#### javascript with set to string		

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

## Java script changing the given array only

```javascript
var sets = new Set();
    let i = 0 ;
    nums.forEach((num)=>{
        if(!sets.has(num)){
            sets.add(num);
            nums[i] = num;
            i++;
        }
    })
    return i;
}
```

## Optimal approach

### Java

```java
//https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

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

### JAVA 2 same approach

```java
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<=nums.length-1;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
```

### Javascript

```javascript
var removeDuplicates = function(nums) {
    var i=0;
    for(var j=1;j<nums.length;j++){
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
