page : dsa-general-12( new lines notes hyd )

Example 1

Input 1: 2

Output 1

0 1
0 2 4

Example 2

Input 1: 3

Output 2

0 1
0 2 4
0 3 9 27

Example 3

Input 1: 5

Output 3

0 1
0 2 4
0 3 9 27
0 4 16 64 256
0 5 25 125 625 3125

```javascript
function generatePattern(rows) {
  let result = '';

  for (let i = 1; i < rows; i++) {
    result += '0 '
    for (let j = 1; j <= i; j++) {
      result += Math.pow(i, j) + ' ';
    }
    result += '\n';
  }

  return result.trim(); // Trim to remove the trailing newline
  return result;//also works without trim
}

// Test Case
const rows = 5;
const pattern = generatePattern(rows);
console.log(pattern);

```
