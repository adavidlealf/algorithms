# Ya Rajaie and Books
https://codeforces.com/problemset/gymProblem/101102/E

## Problem Description
Mr. Ya Rajaie has N books and wants to put them in bookshelves, each bookshelf can have at most 5 books. Find the minimum number of bookshelves needed to store the N books.

### Input
The first line of input contains a single integer T, the number of test cases.

Each test case contains a single integer N (1 ≤ N ≤ 109), the number of Ya’s books.

### Output
For each test case, print on a single line the minimum number of bookshelves needed to store the books.

### Examples
input:
```
2
7
15
```

output:
```
2
3
```

## Solution
Just have to calculate the integer division of N between the capacity of the bookshelves, that is, 5. This result will be the number of bookshelves needed if the module of the division is zero, otherwise, it is the same but plus one.