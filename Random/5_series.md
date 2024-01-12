page : dsa-general-13( new lines notes hyd )

**Write a program to print the following series of numbers ---**

**Series:** 376, 375, 373, 370, ... 100

**Test Cases**

Example 1

Input 1: 376

Output 1

376,375,373,370,366,361,355,348,340,331,321,310,298,285,271,256,240,223,205,186,166,145,123,100

Example 2

Input 1: 267

Output 2

267,266,264,261,257,252,246,239,231,222,212,201,189,176,162,147,131,114

Example 3

Input 1: 350

Output 3

350,349,347,344,340,335,329,322,314,305,295,284,272,259,245,230,214,197,179,160,140,119 


--> subtraction increases upto greater than 100 only


```javascript
function generateSeries(start) {
  const series = [start];
  let subtraction = 1;
  while (start > 100) {
    start -= subtraction;
    subtraction++;
    series.push(start);
  }
  return series.join(', ');
}

// Test Case
const input1 = 350;
const output1 = generateSeries(input1);
console.log(output1)
```
