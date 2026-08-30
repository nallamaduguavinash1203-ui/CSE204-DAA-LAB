# LAB 4 – Hashing

## Objective

To understand hashing and implement different collision-resolution techniques and hashing-based problems.

## Tasks

1. Implement a hash table using Linear Probing.
2. Implement a hash table using Quadratic Probing.
3. Given an array and a target value T, determine whether there are two elements whose sum is equal to T. The average time complexity should be O(n).
4. Given an integer array, use hashing to find the frequency of every distinct element.

## Concepts Used

- Hashing
- Hash Function
- Hash Table
- Collision
- Linear Probing
- Quadratic Probing
- Open Addressing
- Two Sum
- Frequency Counting

## Collision Resolution

### Linear Probing

When a collision occurs, the next consecutive position is checked.

```text
index = (hash + i) % tableSize