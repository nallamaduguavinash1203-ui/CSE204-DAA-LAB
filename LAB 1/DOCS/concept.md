# Linear Search

## Definition
Linear Search is a searching technique that checks each element
of an array sequentially until the required element is found or
the entire array has been searched.

## Algorithm
1. Start from the first element.
2. Compare the current element with the key.
3. If they are equal, return the index.
4. Otherwise move to the next element.
5. If all elements are checked, the element is not found.

## Complexity
Best Case: O(1)
Average Case: O(n)
Worst Case: O(n)


# Binary Search

## Definition
Binary Search is a searching technique used on a sorted array.
It repeatedly divides the search interval into two halves.

## Algorithm
1. Set low = 0 and high = n - 1.
2. Find the middle element.
3. Compare the middle element with the key.
4. If equal, the element is found.
5. If key is smaller, search the left half.
6. If key is larger, search the right half.
7. Repeat until the element is found or the interval becomes empty.

## Complexity
Best Case: O(1)
Average Case: O(log n)
Worst Case: O(log n)