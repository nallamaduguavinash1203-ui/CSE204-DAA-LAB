# LAB 3 - Concepts

## 1. Towers of Hanoi

Towers of Hanoi is a problem involving three rods and a number of disks.

The objective is to move all the disks from the source rod to the destination rod using an auxiliary rod.

### Rules

1. Only one disk can be moved at a time.
2. Only the top disk of a rod can be moved.
3. A larger disk cannot be placed on a smaller disk.

### Recursive Implementation

The recursive solution divides the problem into smaller subproblems.

To move n disks:

1. Move n-1 disks from the source rod to the auxiliary rod.
2. Move the largest disk from the source rod to the destination rod.
3. Move n-1 disks from the auxiliary rod to the destination rod.

### Non-Recursive Implementation

The non-recursive solution performs the same disk movements without using recursive function calls.

It uses an iterative approach to determine and perform the required moves.

---

## 2. Stack Using Linked List

A Stack is a linear data structure that follows the **LIFO (Last In, First Out)** principle.

In a linked-list implementation, each stack element is stored in a node.

### Stack Operations

- **Push** - Adds an element to the top of the stack.
- **Pop** - Removes the top element from the stack.
- **Peek** - Displays the top element without removing it.
- **Display** - Displays the elements of the stack.

The `top` pointer is used to represent the top of the stack.

---

## 3. Queue Using Linked List

A Queue is a linear data structure that follows the **FIFO (First In, First Out)** principle.

In a linked-list implementation, each queue element is stored in a node.

### Queue Operations

- **Enqueue** - Adds an element at the rear of the queue.
- **Dequeue** - Removes an element from the front of the queue.
- **Peek** - Displays the front element.
- **Display** - Displays the elements of the queue.

The `front` and `rear` pointers are used to manage the queue.