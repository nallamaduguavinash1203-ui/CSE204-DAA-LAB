# LAB 1 - Searching Algorithms

## Overview

This lab implements two fundamental searching algorithms in C:

1. Linear Search
2. Binary Search

## Programs

### Linear Search

Linear Search checks each element of an array sequentially until the required element is found or the entire array has been searched.

**Source Code:** `linearsearch.c`

### Binary Search

Binary Search is a searching technique used on a sorted array. It repeatedly divides the search interval into two halves.

**Source Code:** `binarysearch.c`

## Complexity Analysis

| Algorithm | Best Case | Average Case | Worst Case |
|---|---|---|---|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

## Documentation

Detailed definitions, algorithms, and complexity analysis are available in:

`DOCS/concept.md`

## Outputs

The `OUTPUT` folder contains screenshots showing:

- Linear Search - Element Found
- Linear Search - Element Not Found
- Binary Search - Element Found
- Binary Search - Element Not Found