# bruteforce approach

## Java with int[] array
```java
public class Main
{
	public static void main(String[] args) {
		int k = 3;
		int n = 7;
		int[] arr= {1,2,3,4,5,6,7};
		rotateArray(arr,k);
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}
	
	public static int[] rotateArray(int[] arr, int k) {
        //rotate left problem
        int n =arr.length;
        k = k%n;
        int[] temp = new  int[k];
        //move k elements into temp [1,2,3]
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }

        //move reamining elements to front [4,5,6,7.....]
        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }

        //attach temp elements to resultant array [4,5,6,7,1,2,3]
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i] = temp[j];
            j++;
        }
        return arr;
    }
}

```
## Java with ArrayList<Integer> but we need arraylist in coding ninjas
```java
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        //rotate left
        int n =arr.size();
        k = k%n;
        ArrayList<Integer> temp = new ArrayList<>();
        //move k elements into temp [1,2,3]
        for(int i=0;i<k;i++){
            // temp[i] = arr[i];
            temp.add(arr.get(i));
        }

        //move reamining elements to front [4,5,6,7.....]
        for(int i=k;i<n;i++){
            // arr[i-k] = arr[i];
            arr.set(i-k,arr.get(i));
        }

        //attach temp elements to resultant array [4,5,6,7,1,2,3]
        int j=0;
        for(int i=n-k;i<n;i++){
            // arr[i] = temp[j];
	    // arr[i] = temp[i-(n-k)];
            arr.set(i,temp.get(j));
            //arr.set(i,temp.get(i-(n-k)));
            j++;
        }
        return arr;
    }
}
```
## Javascript
```javascript
const LeftRotate = (arr,n,d) =>{
    d = d%n;
    let temp = [];
    //add to temp [1,2,3]
    for(let i=0;i<n;i++){
        temp[i] = arr[i];
    }
    //move rem front [4,5,6,7]
    for(let i=d;i<n;i++){
        arr[i-d] = arr[i];
    }
    //add temp to arr
    for(let i=n-d;i<n;i++){
        arr[i] = temp[i-(n-d)];
    }
    return arr;
};


const arr = [1,2,3,4,5,6,7];
var d =3;
var Lr = LeftRotate(arr,arr.length,d);
console.log(Lr);

```

# optimal approach

## Java
```java


```


## Javascript
```javascript

```


