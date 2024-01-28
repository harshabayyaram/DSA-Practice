page number :- dsa-general-14 ( lines notes ne hyd notes )


## bruteforce 

```java

```

```javascript

```

## optimal

### java

```java
// Java program to convert given sentence
/// to camel case.
class GFG 
{

	// Function to remove spaces and convert
	// into camel case
	static String convert(String s)
	{

		// to count spaces
		int cnt= 0;
		int n = s.length();
		char ch[] = s.toCharArray();
		int res_ind = 0;

		for (int i = 0; i < n; i++) 
		{

			// check for spaces in the sentence
			if (ch[i] == ' ')
			{
				cnt++;
				// conversion into upper case
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);
				continue;
			}

			// If not space, copy character 
			else
				ch[res_ind++] = ch[i]; 
		}

		// new string will be reduced by the 
		// size of spaces in the original string
		return String.valueOf(ch, 0, n - cnt);
	}

	// Driver code
	public static void main(String args[])
	{
		String str = "I get intern at geeksforgeeks";
		System.out.println(convert(str));
	}
}

// This code is contributed by gp6.

```

### javascript

```javascript
<script>

// Function to remove spaces and convert
// into camel case
function convert( s)
{
	var n = s.length;

	var str="";
	for (var i = 0; i < n; i++) 
	{

		// check for spaces in the sentence
		if (s[i] == ' ')
		{
			// conversion into upper case
			str+= s[i+1].toUpperCase();
			i++;
		
		}

		// If not space, copy character
		else{
	
			str+= s[i];
			}
	}

	// return string to main
	return str;
}

var str = "I get intern at geeksforgeeks";
	document.write(convert(str));


</script>

```
