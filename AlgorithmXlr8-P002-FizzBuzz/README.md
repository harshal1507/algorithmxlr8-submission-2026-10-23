<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Fizz Buzz

**Difficulty:** `Easy`

## Problem

Given an integer n, return a string array answer (1-indexed) where:

- answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
- answer[i] == "Fizz" if i is divisible by 3.
- answer[i] == "Buzz" if i is divisible by 5.
- answer[i] == i (as a string) if none of the above conditions are true.

The conditions are checked in that order, so a number divisible by both 3 and 5 (that is, by 15) gives only "FizzBuzz", never "Fizz" or "Buzz".

Input format: a single integer n.

Output format: print n lines. Line i, for i from 1 to n, contains answer[i] without quotes.

## Examples

### Example 1

**Input**
```
n = 3
```
**Output**
```
["1","2","Fizz"]
```

**Explanation:** 1 and 2 are not divisible by 3 or 5, so they are printed as numbers. 3 is divisible by 3, so it becomes Fizz.

### Example 2

**Input**
```
n = 5
```
**Output**
```
["1","2","Fizz","4","Buzz"]
```

**Explanation:** 3 becomes Fizz, 5 is divisible by 5 and becomes Buzz, and 1, 2 and 4 stay as numbers.

### Example 3

**Input**
```
n = 15
```
**Output**
```
["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
```

**Explanation:** Multiples of 3 (3, 6, 9, 12) become Fizz, multiples of 5 (5, 10) become Buzz, and 15 is divisible by both, so it becomes FizzBuzz.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/fizz-buzz).