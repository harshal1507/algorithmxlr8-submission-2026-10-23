<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Move Zeroes

**Difficulty:** `Easy`

## Problem

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

The non-zero elements must keep the order in which they appear in the original array, and all the zeros must end up in the last positions of the array. The number of zeros does not change. If the array has no zeros, or contains only zeros, it stays exactly as it is. Negative numbers are non-zero and are treated like any other non-zero value.

Follow up: Could you minimize the total number of operations done?

Input format: The first line contains an integer n, the length of nums. The second line contains n space-separated integers, the elements of nums.

Output format: Print the n elements of nums after moving the zeros, space-separated on a single line.

## Examples

### Example 1

**Input**
```
nums = [0,1,0,3,12]
```
**Output**
```
[1,3,12,0,0]
```

**Explanation:** The non-zero elements 1, 3 and 12 keep their relative order and move to the front, and the two zeros move to the end.

### Example 2

**Input**
```
nums = [0]
```
**Output**
```
[0]
```

**Explanation:** The array contains a single zero, so it stays unchanged.

### Example 3

**Input**
```
nums = [4,0,0,5,0,6]
```
**Output**
```
[4,5,6,0,0,0]
```

**Explanation:** The non-zero elements 4, 5 and 6 keep their order at the front, followed by the three zeros.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/move-zeroes-two-pointers).