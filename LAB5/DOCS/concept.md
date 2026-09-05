# LAB 5 - Concepts

## 1. Merge Sort

Merge Sort is a sorting algorithm based on the Divide and Conquer technique.

The array is repeatedly divided into two smaller halves until each subarray contains only one element.

The smaller subarrays are then merged in sorted order to produce the final sorted array.

### Steps

1. Divide the array into two halves.
2. Recursively sort both halves.
3. Merge the sorted halves.

Merge Sort is a stable sorting algorithm.

---

## 2. Bucket Sort

Bucket Sort is a sorting algorithm that distributes elements into different buckets.

Each bucket stores elements belonging to a particular range.

After distributing the elements, the buckets are sorted individually and combined to obtain the final sorted array.

### Steps

1. Find the range of elements.
2. Create required buckets.
3. Place each element into its corresponding bucket.
4. Sort the elements in the buckets.
5. Combine all buckets to get the sorted array.

Bucket Sort is efficient when the input values are uniformly distributed over a known range.

---

## 3. Quick Sort

Quick Sort is a sorting algorithm based on the Divide and Conquer technique.

A pivot element is selected from the array.

The array is partitioned so that:

- Elements smaller than the pivot are placed on the left.
- Elements greater than the pivot are placed on the right.

The same process is recursively applied to the left and right parts.

### Steps

1. Select a pivot element.
2. Partition the array around the pivot.
3. Recursively sort the left subarray.
4. Recursively sort the right subarray.

Quick Sort is generally faster in practice for many applications.