# Complexity Analysis

## Linear Search

Linear Search checks elements one by one until the required element is found.

### Best Case
**O(1)**

The element is found at the first position.

### Average Case
**O(n)**

The element may be found somewhere in the middle of the array.

### Worst Case
**O(n)**

The element is at the last position or is not present in the array.

---

## Binary Search

Binary Search works on a sorted array and repeatedly divides the search interval into two halves.

### Best Case
**O(1)**

The required element is found at the middle position in the first comparison.

### Average Case
**O(log n)**

The search interval is repeatedly divided into two halves.

### Worst Case
**O(log n)**

The maximum number of comparisons is logarithmic because the search space is halved at every step.

---

## Comparison

| Algorithm | Best Case | Average Case | Worst Case |
|---|---|---|---|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |