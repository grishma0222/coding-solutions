# Count Servers that Communicate

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a map of a server center, represented as a `m * n` integer matrix `grid`, where 1 means that on that cell there is a server and 0 means that it is no server. Two servers are said to communicate if they are on the same row or on the same column.

Return the number of servers that communicate with any other server.

 

Original
Java
 **Example 1:** 

```
Input: grid = [[1,0],[0,1]]
Output: 0
Explanation: No servers can communicate with others.
```

 **Example 2:** 

```
Input: grid = [[1,0],[1,1]]
Output: 3
Explanation: All three servers can communicate with at least one other server.

```

 **Example 3:** 

```
Input: grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
Output: 4
Explanation: The two servers in the first row can communicate with each other. The two servers in the third column can communicate with each other. The server at right bottom corner can't communicate with any other server.

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m <= 250
- 1 <= n <= 250
- grid[i][j] == 0 or 1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.93%)  
**Memory:** 54.9 MB (beats 49.07%)  
**Submitted:** 2026-11-12T16:11:59.296Z  

```java
class Solution {
    public int countServers(int[][] grid) {
          int n=grid.length;
     int m=grid[0].length;
     int[] rows=new int[n];
     int[] cols=new int[m];
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]==1){
                rows[i]++;
                cols[j]++;
            }
        }
     }   
     int c=0;
      for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]==1){
                if(rows[i]>=2 || cols[j]>=2)
                {
                    c++;
                }
            }
        }
     }
     return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-servers-that-communicate/)