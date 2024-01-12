page : dsa-general-12( new lines notes hyd )

Input 1: 5

Output 1

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

```javascript
function printPattern(rows) {
  for (let i = rows; i >= 1; i--) {
    let pattern = '';
    for (let j = 1; j <= i; j++) {
      pattern += j + ' ';
    }
    console.log(pattern.trim());
  }
}

// Test Case
const rows = 5;
printPattern(rows);

```

``````javascript
function printPattern(n) {
  let pattern = '';
  for (let i = n; i >= 1; i--) {
    for (let j = 1; j <= i; j++) {
      pattern += j + ' ';
    }
    // console.log(pattern.trim());
    pattern += '\n'
  }
  // return pattern;
  console.log(pattern)
}

// Test Case
const rows = 5;
// console.log(printPattern(rows))

printPattern(rows)

``````
