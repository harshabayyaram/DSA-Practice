Notes in : DSA-general-15

# Reverse a number

## Bruteforce approach

### Java

```java
// link of problem : 

static int rev(int n){
	int reverse = 0;
	while(n>0){
		int r = n% 10;
		reverse = reverse*+r;
		n=n/10;
	}
	return reverse
}
```

### Javascript

```javascript
// link of problem : 

function(n){
	let reverse = 0;
	while(n>0){
		ler r = n%10;
		reverse = reverse*10+r;
		n = n /10;
	}
	return reverse;
}
```
