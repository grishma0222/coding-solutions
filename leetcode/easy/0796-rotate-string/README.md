# Rotate String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `goal`, return `true`  *if and only if*  `s`  *can become*  `goal`  *after some number of  **shifts**  on*  `s`.

A  **shift**  on `s` consists of moving the leftmost character of `s` to the rightmost position.

- For example, if s = "abcde", then it will be "bcdea" after one shift.

 

Original
Java
 **Example 1:** 

 **Input:**  s = "abcde", goal = "cdeab"

 **Output:**  true

 **Explanation:** 

Rotating `s` to the left by 2 positions moves `"ab"` to the end, resulting in `"cdeab"`, which is equal to `goal`.

 **Example 2:** 

 **Input:**  s = "abcde", goal = "abced"

 **Output:**  false

 **Explanation:** 

No sequence of rotations of `s` can produce `"abced"`. The characters appear in a different relative order, so `goal` is not a rotation of `s`.

 

 **Constraints:** 

- 1 <= s.length, goal.length <= 100
- s and goal consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.9 MB  
**Submitted:** 2026-11-12T16:11:09.746Z  

```java
class Solution {
    public boolean rotateString(String s, String goal) {
           if(s.length()==goal.length() && (s+s).contains(goal)) return true;
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-string/)