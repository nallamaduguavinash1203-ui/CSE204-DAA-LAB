# Time Complexity Analysis

## 1. Maximum and Minimum - Divide and Conquer

Time Complexity: O(n)

Traditional approach also takes O(n), but Divide and Conquer can reduce
the number of comparisons.

## 2. Maximum Subarray - Divide and Conquer

Best/Average/Worst Time Complexity: O(n log n)

The array is divided into two halves at each level.

## 3. Strassen's Matrix Multiplication

Time Complexity: O(n^log₂7) ≈ O(n^2.807)

Normal matrix multiplication: O(n³)

Therefore, Strassen's algorithm is faster for large matrices.

## 4. Fractional Knapsack - Greedy

Sorting the items takes O(n log n).
Selecting the items takes O(n).

Overall Time Complexity: O(n log n)