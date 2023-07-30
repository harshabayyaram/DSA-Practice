/*
https://www.hackerrank.com/contests/cdc-contest-3rd-yr/challenges/set-matrix-zeroes-3/problem
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Input Format

First line contains number of rows and columns respectively seperated by space. A matrix of size mxn will be given.

Constraints

m == matrix.length

n == matrix[0].length

1 <= m, n <= 200

-2^31 <= matrix[i][j] <= 2^31 - 1

Output Format

Print the resultant matrix

Sample Input 0

3 3
1 1 1
1 0 1
1 1 1 
Sample Output 0

1 0 1 
0 0 0 
1 0 1



*/


import java.io.*;
import java.util.*;

public class Solution {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create arrays to track the rows and columns with zeros
        boolean[] zero_rows = new boolean[rows];
        boolean[] zero_cols = new boolean[cols];

        // Initialize the arrays
        for (int i = 0; i < rows; i++) {
            zero_rows[i] = false;
        }

        for (int j = 0; j < cols; j++) {
            zero_cols[j] = false;
        }

        // Traverse the matrix to find the positions of 0s
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zero_rows[i] = true;
                    zero_cols[j] = true;
                }
            }
        }

        // Set entire rows and columns to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zero_rows[i] || zero_cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        setZeroes(matrix);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}






