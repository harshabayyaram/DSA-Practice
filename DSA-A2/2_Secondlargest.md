#Second largest number in array with bruteforce approach

## Java
```java
public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        int largest = a[n-1];
        int secondLargest = -1;
        for(int i=n-2;i>=0;i--){
            if(a[i]!=largest){
                secondLargest = a[i];
                break;
            }
        }
        int res[] = new int[2];
        res[0] = secondLargest;
        res[1] = a[1];
        return res;
    }
```
## Javascript
```javascript
function largArr(arr,n){
        arr.sort((a,b)=>a-b)
        var largest =arr[n-1];
        var secondLargest = -1;
        for(var i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
}


const arr = [1,2,3,121,5,6,7];
console.log(largArr(arr,arr.length));
```


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
## JavaScript
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

# Second largest in array with optimal approach

## Java
```java


```


## Javascript
```javascript

```
