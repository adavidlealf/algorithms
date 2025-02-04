# Array Coloring
https://codeforces.com/problemset/problem/1857/A

## Problem Description
You are given an array consisting of n integers. Your task is to determine whether it is possible to color all its elements in two colors in such a way that the sums of the elements of both colors have the same parity and each color has at least one element colored.

For example, if the array is [1,2,4,3,2,3,5,4], we can color it as follows: [1,2,4,3,2,3,5,4], where the sum of the blue elements is 6 and the sum of the red elements is 18.

### Input
The first line contains an integer t (1≤t≤1000) — the number of test cases.

Each test case begins with a line containing an integer n (2≤n≤50) — the length of the array a.

The next line contains n integers a1,a2,…,an (1≤ai≤50) — the elements of the array a.

### Output
For each test case, output "YES" (without quotes) if it is possible to color the array in two colors in such a way that the sums of the elements of both colors have the same parity and each color has at least one element colored, and "NO" otherwise.

You can output "Yes" and "No" in any case (for example, the strings "yES", "yes", and "Yes" will be recognized as correct answers).

### Examples
input:
```
7
8
1 2 4 3 2 3 5 4
2
4 7
3
3 9 8
2
1 7
5
5 4 3 2 1
4
4 3 4 5
2
50 48
```

output:
```
YES
NO
YES
YES
NO
YES
YES
```

### Note
The first sample is described in the statement.

In the second sample, there are only two colorings [4,7] and [4,7] , but in both cases the parity of sums is different.

In the third sample, you can color [3,9,8] and 12 and 8 are both even.

## Solution
The trick in this problem lies in the mathemathical property of even numbers. Since any even number is the sum of numbers with same parity (the sum of two even numbers or the sumb of two odd numbers), then if the sum of all numbers ai is even, so the output is YES, otherwise is NO.