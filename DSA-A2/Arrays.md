# Second Largest Number with better approach
## Java
```Java
public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int largest = a[0];
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }

        int secondLargest = -1;
        for(int i=0;i<n;i++){
            if(a[i]>secondLargest && a[i]!=largest){
                secondLargest = a[i];
            }
        }

        int res[] = new int[1];
        res[0] = secondLargest;
        return res;

        
    }

```

```javascript
function largArr(arr,n){
    var largest =arr[0];
    for(var i=0;i<n;i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
    var sL = -1;
    for(var i=0;i<n;i++){
        if(arr[i]>sL && arr[i]!=largest){
            sL = arr[i];
        }
    }
    return a;
}


const arr = [1,2,3,121,5,6,7];
console.log(largArr(arr,arr.length));

```
