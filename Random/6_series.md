 page : dsa-general-13( new lines notes hyd )

## **Print Series**

**Write a program to print the following series of numbers ---**

**Series:** 2,5,10,17,26,…...., n

**The program should print the numbers lesser than a certain number. The max number should be taken as a variable input.**

Look into the sample inputs and outputs to understand the problem better. Do not delete the main method.

Note: The function should accept 'n' as a parameter and return the String which contains the series of numbers till n and should not return the number above n.

**Test Cases**

Example 1

Input 1: 17

Output 1

2,5,10,17

Example 2

Input 1: 400

Output 2

2,5,10,17,26,37,50,65,82,101,122,145,170,197,226,257,290,325,362

Example 3

Input 1: 51

Output 3

2,5,10,17,26,37,50



```javascript
function printSeries(n) {
  let series = [];
  let currentNumber = 2;
  let increment = 3;
  while (currentNumber <= n) {
    series.push(currentNumber);
    currentNumber += increment;
    increment += 2;
  }
  return series.join(',');
}

// Sample Test Cases
const input1 = 50;
console.log(`Input 1: ${input1}\nOutput 1: ${printSeries(input1)}\n`);
```
