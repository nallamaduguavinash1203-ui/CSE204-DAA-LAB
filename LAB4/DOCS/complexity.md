# LAB 4 – Complexity Analysis

## 1. Hash Table Using Linear Probing

### Time Complexity

- Insertion: O(1) average
- Search: O(1) average
- Worst case: O(n)

### Space Complexity

- O(n)

The worst case occurs when many elements produce collisions and several positions have to be checked.

---

## 2. Hash Table Using Quadratic Probing

### Time Complexity

- Insertion: O(1) average
- Search: O(1) average
- Worst case: O(n)

### Space Complexity

- O(n)

Quadratic probing reduces clustering compared with linear probing, but a large number of collisions can still increase the number of probes.

---

## 3. Two Sum Using Hashing

For each element, we calculate the required value:

    required = T - arr[i]

The hash table is used to check whether the required value already exists.

### Time Complexity

- Average: O(n)
- Worst case: O(n²)

### Space Complexity

- O(n)

The average O(n) complexity is achieved because hash table insertion and search take O(1) average time.

---

## 4. Frequency of Every Distinct Element

Each array element is inserted into the hash table or its existing frequency is increased.

### Time Complexity

- Average: O(n)
- Worst case: O(n²)

### Space Complexity

- O(n)

At most n distinct elements may need to be stored in the hash table.

---

## Summary

| Task | Average Time | Worst Time | Space |
|------|--------------|------------|-------|
| Linear Probing | O(1) per operation | O(n) | O(n) |
| Quadratic Probing | O(1) per operation | O(n) | O(n) |
| Two Sum | O(n) | O(n²) | O(n) |
| Frequency Counting | O(n) | O(n²) | O(n) |